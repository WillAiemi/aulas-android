package willian.duarte.diceroller.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;

import willian.duarte.diceroller.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private RadioGroup rgDice;
    private Button btRoll;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialize();
    }

    @Override
    public void onClick(View v) {

    }

    private void initialize(){
        rgDice = findViewById(R.id.ma_rg_dice);
        btRoll = findViewById(R.id.ma_bt_roll);
        tvResult = findViewById(R.id.ma_tv_result);

        btRoll.setOnClickListener(this);
    }
}
