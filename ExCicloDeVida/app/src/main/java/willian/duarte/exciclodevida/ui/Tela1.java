package willian.duarte.exciclodevida.ui;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import willian.duarte.exciclodevida.R;
import willian.duarte.exciclodevida.model.Client;

public class Tela1 extends AppCompatActivity {

    private static final String TAG = "logsTela1";
    private EditText etUrl;
    private Button btUrl;
    private EditText etNumber;
    private Button btNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela1);
        Log.d(TAG,"Entraste no onCreate...");

        etUrl = findViewById(R.id.t1_et_url);
        btUrl = findViewById(R.id.t1_bt_url);
        etNumber = findViewById(R.id.t1_et_number);
        btNumber = findViewById(R.id.t1_bt_number);

        btUrl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri =  Uri.parse("https://"+etUrl.getText().toString());
                Intent it = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(it);
            }
        });

        btNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("tel:"+etNumber.getText().toString());
                Intent it = new Intent(Intent.ACTION_DIAL,uri);
                startActivity(it);
            }
        });

        /*
        if (getIntent().hasExtra("nome")){
        também funciona
        ***************
        if (getIntent().getStringExtra("nome") != null){
            String nome = getIntent().getStringExtra("nome");

            Toast.makeText(getBaseContext(), "Olá "+nome,Toast.LENGTH_LONG).show();
        }
        */
        if (getIntent().hasExtra("c")){
            Client c = (Client) getIntent().getParcelableExtra("c");

            Toast.makeText(getBaseContext(), "Olá "+c,Toast.LENGTH_LONG).show();
        }

    }// close onCreate

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"Entraste no onStart...");
    }// close onStart

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"Entraste no onResume...");
    }// close onResume

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"Entraste no onPause...");
    }// close onPause

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"Entraste no onStop...");
    }// close onStop

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG,"Entraste no onRestart...");
    }// close onRestart

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"Entraste no onDestroy...");
    }// close onDestroy
}
