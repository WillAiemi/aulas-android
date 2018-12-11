package willian.duarte.exerciciosintentpermissions.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import willian.duarte.exerciciosintentpermissions.R;

public class Screen2Answer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2_answer);

        if (getIntent().hasExtra("sentence")){
            String msg = getIntent().getStringExtra("sentence");
            Toast.makeText(getBaseContext(),msg,Toast.LENGTH_LONG).show();
        }
    }
}
