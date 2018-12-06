package willian.duarte.notasaluno.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import willian.duarte.notasaluno.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText etName;
    private EditText etN1;
    private EditText etN2;
    private RadioGroup rgSex;
    private Button btRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialize();
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.ma_bt_register:
                if (etName.getText().toString().isEmpty()){
                    etName.setError(getResources().getString(R.string.error_etname));
                    return;
                }
                if (etN1.getText().toString().isEmpty()){
                    etN1.setError(getResources().getString(R.string.error_etn1));
                    return;
                }
                if (etN2.getText().toString().isEmpty()){
                    etN2.setError(getResources().getString(R.string.error_etn2));
                    return;
                }
                RadioButton rbChecked = findViewById(rgSex.getCheckedRadioButtonId());
                if (rbChecked == null){
                    toast(getResources().getString(R.string.error_rb));
                    return;
                }

                break;
        }
    }

    private void toast(String msg){
        Toast.makeText(getBaseContext(), msg, Toast.LENGTH_LONG).show();
    }

    private void initialize(){
        etName = findViewById(R.id.ma_et_name);
        etN1 = findViewById(R.id.ma_et_n1);
        etN2 = findViewById(R.id.ma_et_n2);
        rgSex = findViewById(R.id.ma_rg_sex);
        btRegister = findViewById(R.id.ma_bt_register);

        btRegister.setOnClickListener(this);
    }
}
