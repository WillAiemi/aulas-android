package willian.duarte.exintentexplicitaobjetotarde.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import willian.duarte.exintentexplicitaobjetotarde.R;

public class MainActivity extends AppCompatActivity {

    private Button btTela1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        btTela1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this,Tela1.class);
                startActivity(it);
            }
        });
    }

    private void init(){
        btTela1 = findViewById(R.id.ma_bt_tela1);
    }
}
