package willian.duarte.exspinnerlistviewstringarray.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import willian.duarte.exspinnerlistviewstringarray.R;

public class Launcher extends AppCompatActivity {

    private Button btMa1;
    private Button btMa2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);

        init();

        btMa1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Launcher.this,MainActivity.class);
                startActivity(it);
            }
        });

        btMa2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Launcher.this,Main2Activity.class);
                startActivity(it);
            }
        });
    }

    private void init(){
        btMa1 = findViewById(R.id.lc_bt_ma1);
        btMa2 = findViewById(R.id.lc_bt_ma2);
    }
}
