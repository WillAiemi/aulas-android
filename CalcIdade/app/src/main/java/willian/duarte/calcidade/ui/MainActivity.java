package willian.duarte.calcidade.ui;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import willian.duarte.calcidade.R;
import willian.duarte.calcidade.model.Pessoa;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText etName;
    private EditText etAge;
    private Button btCalc;
    private TextView tvResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialize();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.ma_bt_calc:
                Pessoa p = new Pessoa(MainActivity.this);
                p.setName(etName.getText().toString());
                p.setAge(Integer.parseInt(etAge.getText().toString()));
                tvResult.setText(p.toString());
                break;
        }
    }

    private void initialize(){
        etName = findViewById(R.id.ma_et_name);
        etAge = findViewById(R.id.ma_et_age);
        btCalc = findViewById(R.id.ma_bt_calc);
        tvResult = findViewById(R.id.ma_tv_result);

        btCalc.setOnClickListener(this);
    }
}
