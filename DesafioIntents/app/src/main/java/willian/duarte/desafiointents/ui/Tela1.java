package willian.duarte.desafiointents.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import willian.duarte.desafiointents.R;

public class Tela1 extends AppCompatActivity {

    private EditText etName;
    private Button btOk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela1);

        etName = findViewById(R.id.t1_et_name);
        btOk = findViewById(R.id.t1_bt_ok);

        btOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (etName.getText().toString().isEmpty()){
                    etName.setError("Type a name here...");
                    return;
                }
                Intent it = new Intent(Tela1.this,Tela1Sub.class);
                it.putExtra("name",etName.getText().toString());
                startActivity(it);
            }
        });
    }
}
