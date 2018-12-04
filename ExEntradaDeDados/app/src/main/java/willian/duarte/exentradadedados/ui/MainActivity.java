package willian.duarte.exentradadedados.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import willian.duarte.exentradadedados.R;
import willian.duarte.exentradadedados.model.Pessoa;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //Widgets
    private EditText etName;
    private EditText etAge;
    private EditText etWeight;
    private TextView tvAnswer;
    private Button btOk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialize();

        btOk.setOnClickListener(this);



    }//fecha onCreate

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.ma_bt_ok:
                if (etName.getText().toString().isEmpty()) {
                    etName.setError("Digite seu nome!");
                    toast("Digite seu nome!");
                    return;
                }

                if (etAge.getText().toString().isEmpty()) {
                    etAge.setError("Digite sua idade!");
                    toast("Digite sua idade!");
                    return;
                }

                if (etWeight.getText().toString().isEmpty()) {
                    etWeight.setError("Digite seu peso!");
                    toast("Digite seu peso!");
                    return;
                }

                Pessoa p = new Pessoa();
                p.setName(etName.getText().toString());
                p.setAge(Integer.parseInt(etAge.getText().toString()));
                p.setWeight(Double.parseDouble(etWeight.getText().toString()));
                tvAnswer.setText("Pessoa cadastrada com sucesso!\n"+p.toString());
                toast("Pessoa cadastrada com sucesso!\n"+p.toString());
                break;
        }
    }

    private void toast(String msg){
        Toast.makeText(getBaseContext(),msg,Toast.LENGTH_LONG).show();
    }

    private void initialize(){
        //Refs
        etName = findViewById(R.id.ma_et_name);
        etAge = findViewById(R.id.ma_et_age);
        etWeight = findViewById(R.id.ma_et_weight);
        tvAnswer = findViewById(R.id.ma_tv_answer);
        btOk = findViewById(R.id.ma_bt_ok);
    }


}//fecha MainActivity
