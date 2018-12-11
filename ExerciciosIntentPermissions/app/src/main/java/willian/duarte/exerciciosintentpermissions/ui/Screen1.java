package willian.duarte.exerciciosintentpermissions.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import willian.duarte.exerciciosintentpermissions.R;
import willian.duarte.exerciciosintentpermissions.model.Person;

public class Screen1 extends AppCompatActivity implements View.OnClickListener {

    private EditText etName;
    private EditText etAge;
    private Button btOk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen1);

        init();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.s1_bt_ok:
                if (etName.getText().toString().isEmpty()){
                    etName.setError("Type a name...");
                    return;
                }
                if (etAge.getText().toString().isEmpty()){
                    etAge.setError("Type an age...");
                    return;
                }
                Person p = new Person();
                p.setName(etName.getText().toString());
                p.setAge(Integer.parseInt(etAge.getText().toString()));
                Intent it = new Intent(Screen1.this,Screen1Answer.class);
                it.putExtra("p",p);
                startActivity(it);
                break;
        }
    }

    private void init(){
        etName = findViewById(R.id.s1_et_name);
        etAge = findViewById(R.id.s1_et_age);

        btOk = findViewById(R.id.s1_bt_ok);
        btOk.setOnClickListener(this);
    }
}
