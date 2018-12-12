package willian.duarte.exerciciosspinnerearrayadapter.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import willian.duarte.exerciciosspinnerearrayadapter.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btEx1;
    private Button btEx2;
    private Button btEx3;
    private Button btEx4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.ma_bt_ex1:
                Intent it1 = new Intent(MainActivity.this,Exercicio1.class);
                startActivity(it1);
                break;
            case R.id.ma_bt_ex2:
                Intent it2 = new Intent(MainActivity.this,Exercicio2.class);
                startActivity(it2);
                break;
            case R.id.ma_bt_ex3:
                Intent it3 = new Intent(MainActivity.this,Exercicio3.class);
                startActivity(it3);
                break;
            case R.id.ma_bt_ex4:
                Intent it4 = new Intent(MainActivity.this,Exercicio4.class);
                startActivity(it4);
                break;
        }
    }

    private void init(){
        btEx1 = findViewById(R.id.ma_bt_ex1);
        btEx1.setOnClickListener(this);

        btEx2 = findViewById(R.id.ma_bt_ex2);
        btEx2.setOnClickListener(this);

        btEx3 = findViewById(R.id.ma_bt_ex3);
        btEx3.setOnClickListener(this);

        btEx4 = findViewById(R.id.ma_bt_ex4);
        btEx4.setOnClickListener(this);
    }
}
