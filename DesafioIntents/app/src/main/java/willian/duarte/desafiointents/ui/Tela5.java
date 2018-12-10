package willian.duarte.desafiointents.ui;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import willian.duarte.desafiointents.R;

public class Tela5 extends AppCompatActivity {

    private EditText etPhone;
    private EditText etText;
    private Button btOk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela5);

        etPhone = findViewById(R.id.t5_et_phone);
        etText = findViewById(R.id.t5_et_text);
        btOk = findViewById(R.id.t5_bt_ok);

        btOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (etPhone.getText().toString().isEmpty()){
                    etPhone.setError("Type a phone number here...");
                    return;
                }
                if (etText.getText().toString().isEmpty()){
                    etText.setError("Type your text here...");
                    return;
                }
                Uri uri = Uri.parse("smsto:"+etPhone.getText().toString());
                Intent it = new Intent(Intent.ACTION_SENDTO, uri);
                it.putExtra("sms_body",etText.getText().toString());
                startActivity(it);
            }
        });
    }
}
