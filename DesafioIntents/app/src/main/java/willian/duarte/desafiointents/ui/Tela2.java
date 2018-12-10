package willian.duarte.desafiointents.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import willian.duarte.desafiointents.R;
import willian.duarte.desafiointents.model.Person;

public class Tela2 extends AppCompatActivity {

    private EditText etName;
    private EditText etAge;
    private Button btOk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        etName = findViewById(R.id.t2_et_name);
        etAge = findViewById(R.id.t2_et_age);
        btOk = findViewById(R.id.t2_bt_ok);

        btOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (etName.getText().toString().isEmpty()){
                    etName.setError("Type a name here...");
                    return;
                }
                if (etAge.getText().toString().isEmpty()){
                    etAge.setError("Type an age here...");
                    return;
                }
                Person p = new Person();
                p.setName(etName.getText().toString());
                p.setAge(Integer.parseInt(etAge.getText().toString()));

                Intent it = new Intent(Tela2.this,Tela2Sub.class);
                it.putExtra("p",p);
                startActivity(it);


            }
        });

    }
}
