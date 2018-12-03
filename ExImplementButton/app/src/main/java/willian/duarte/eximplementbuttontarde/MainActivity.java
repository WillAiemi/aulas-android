package willian.duarte.eximplementbuttontarde;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, View.OnLongClickListener {

    private Button bt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.bt1 = findViewById(R.id.ma_bt_1);

        this.bt1.setOnClickListener(this);
        this.bt1.setOnLongClickListener(this);
    }// fecha onCreate

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.ma_bt_1:
                toast("Dança louco...");
                break;
        }
    }

    @Override
    public boolean onLongClick(View v) {
        switch (v.getId()){
            case R.id.ma_bt_1:
                toast("Dança INSANO...");
                break;
        }
        return true;
    }

    private void toast(String msg){
        Toast.makeText(MainActivity.this,msg,Toast.LENGTH_LONG).show();
    }


}// fecha MainActivity
