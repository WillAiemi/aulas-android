package willian.duarte.exonclickonlongclick;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TabHost;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button bt1;
    private Button bt3;
    private Button bt4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.bt1 = findViewById(R.id.ma_bt_1);
        this.bt3 = findViewById(R.id.ma_bt_3);
        this.bt4 = findViewById(R.id.ma_bt_4);

        this.bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bt1.setText(R.string.bt_click);
                toast("Aaaa");
            }
        });

        this.bt1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                bt1.setText(R.string.bt_long_click);
                toast("Ooooo");
                return true;
            }
        });

        View.OnClickListener clique = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toast("x");
            }
        };

        this.bt3.setOnClickListener(clique);
        this.bt4.setOnClickListener(clique);

    }// fecha onCreate

    private void toast(String msg){
        Toast.makeText(MainActivity.this,msg,Toast.LENGTH_LONG).show();
    }

    public void clickButton2(View view) {
        this.bt1.setText(R.string.bt_normal);
        toast("Fala galeraaaaaaa!!");
    }
}//fecha MainActivity
