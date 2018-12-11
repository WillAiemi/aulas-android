package willian.duarte.exerciciosintentpermissions.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import willian.duarte.exerciciosintentpermissions.R;

public class Screen2 extends AppCompatActivity implements View.OnClickListener {

    private EditText etSentence;
    private Button btOk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);
        init();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.s2_bt_ok:
                if (etSentence.getText().toString().isEmpty()){
                    etSentence.setError("Write a sentence here...");
                    return;
                }
                Intent it = new Intent(Screen2.this,Screen2Answer.class);
                it.putExtra("sentence",etSentence.getText().toString());
                startActivity(it);
                break;
        }
    }

    private void init(){
        etSentence = findViewById(R.id.s2_et_sentence);
        btOk = findViewById(R.id.s2_bt_ok);
        btOk.setOnClickListener(this);
    }
}
