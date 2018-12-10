package willian.duarte.desafiointents.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import willian.duarte.desafiointents.R;

public class MainActivity extends AppCompatActivity {

    private Button btT1;
    private Button btT2;
    private Button btT5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btT1 = findViewById(R.id.ma_bt_tela1);
        btT2 = findViewById(R.id.ma_bt_tela2);
        btT5 = findViewById(R.id.ma_bt_tela5);

        btT1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this,Tela1.class);
                startActivity(it);
            }
        });

        btT2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this,Tela2.class);
                startActivity(it);
            }
        });

        btT5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this,Tela5.class);
                startActivity(it);
            }
        });

    }
}
