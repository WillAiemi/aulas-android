package willian.duarte.exciclodevida.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import willian.duarte.exciclodevida.R;
import willian.duarte.exciclodevida.model.Client;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "logsMainActivity";

    private Button btOk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG,"Entrou no onCreate");

        btOk = findViewById(R.id.ma_bt_ok);
        btOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Client c = new Client();
                c.setName("Zé");
                c.setIncome(8000000.99);

                Intent it = new Intent(MainActivity.this, Tela1.class);

                it.putExtra("nome","Willian Duarte");
                it.putExtra("c",c);

                startActivity(it);

                /*
                startActivity(new Intent(MainActivity.this,Tela1.class));
                */
            }
        });
    }//close onCreate

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"Entrou no onStart");
    }// close onStart

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"Entrou no onResume");
    }// close onResume

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"Entrou no onPause");
    }// close onPause

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"Entrou no onStop");
    }// close onStop

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG,"Entrou no onRestart");
    }// close onRestart

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"Entrou no onDestroy");
    }// close onDestroy

}// close MainActivity
