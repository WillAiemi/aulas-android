package willian.duarte.calculadoradoamor;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText etNome;
    private EditText etCrush;
    private Button btCalc;
    private TextView tvLove;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialize();

        btCalc.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.ma_bt_calc:
                if (etNome.getText().toString().isEmpty()){
                    toast("Digite seu nome!");
                    etNome.setError("Digite seu nome!");
                    return;
                }

                if (etCrush.getText().toString().isEmpty()){
                    toast("Digite o nome do seu crush!");
                    etCrush.setError("Digite o nome do seu crush!");
                    return;
                }

                Random random = new Random();
                int finalValue;
                if (random.nextInt(10)>3){
                     finalValue = random.nextInt(40)+61;
                } else {
                    finalValue = random.nextInt(100);
                }
                animateTextView(0, finalValue,tvLove);
                break;
        }
    }

    public void animateTextView(int initialValue, int finalValue, final TextView textview) {
        DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator(0.8f);
        int start = Math.min(initialValue, finalValue);
        int end = Math.max(initialValue, finalValue);
        int difference = Math.abs(finalValue - initialValue);
        Handler handler = new Handler();
        for (int count = start; count <= end; count++) {
            int time = Math.round(decelerateInterpolator.getInterpolation((((float) count) / difference)) * 100) * count;
            final int finalCount = ((initialValue > finalValue) ? initialValue - count : count);
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    textview.setText(String.valueOf(finalCount)+"%");
                }
            }, time);
        }
    }

    private void initialize(){
        etNome = findViewById(R.id.ma_et_name);
        etCrush = findViewById(R.id.ma_et_crush);
        btCalc = findViewById(R.id.ma_bt_calc);
        tvLove = findViewById(R.id.ma_tv_loveMeter);
    }

    private void toast(String msg){
        Toast.makeText(getBaseContext(), msg, Toast.LENGTH_LONG).show();
    }


}
