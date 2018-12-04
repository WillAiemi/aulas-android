package willian.duarte.exdesafiodebuttons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button bt3;
    private Button bt4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.bt3 = findViewById(R.id.ma_bt_3);
        this.bt4 = findViewById(R.id.ma_bt_4);

        this.bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toast("Botão 3 clique simples: CHECK");
            }
        });

        this.bt3.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                toast("Botão 3 clique longo: MUITO BOM");
                return true;
            }
        });

        this.bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toast("Botão 4 clique simples: FUNCIONANDO DE BOA");
            }
        });

        this.bt4.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                toast("Botão 4 clique longo: sto' emocionado...");
                return true;
            }
        });

    }

    public void clickButton1(View view) {
        toast("Botão 1 clicado, boa rapazzzz");
    }

    public void clickButton2(View view) {
        toast("Botão 2 clicado, quanta inteligencia");
    }

    public void toast(String msg){
        Toast.makeText(MainActivity.this,msg,Toast.LENGTH_SHORT).show();
    }

}
