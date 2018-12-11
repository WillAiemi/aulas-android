package willian.duarte.exerciciosintentpermissions.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import willian.duarte.exerciciosintentpermissions.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btTela1;
    private Button btTela2;
    private Button btTela3;
    private Button btTela4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.ma_bt_tela1:
                Intent it1 = new Intent(MainActivity.this,Screen1.class);
                startActivity(it1);
                break;
            case R.id.ma_bt_tela2:
                Intent it2 = new Intent(MainActivity.this,Screen2.class);
                startActivity(it2);
                break;
            case R.id.ma_bt_tela3:
                Intent it3 = new Intent(MainActivity.this,Screen3.class);
                startActivity(it3);
                break;
            case R.id.ma_bt_tela4:
                Intent it4 = new Intent(MainActivity.this,Screen4Dexter.class);
                startActivity(it4);
                break;
        }
    }

    private void init(){
        btTela1 = findViewById(R.id.ma_bt_tela1);
        btTela1.setOnClickListener(this);

        btTela2 = findViewById(R.id.ma_bt_tela2);
        btTela2.setOnClickListener(this);

        btTela3 = findViewById(R.id.ma_bt_tela3);
        btTela3.setOnClickListener(this);

        btTela4 = findViewById(R.id.ma_bt_tela4);
        btTela4.setOnClickListener(this);
    }
}
