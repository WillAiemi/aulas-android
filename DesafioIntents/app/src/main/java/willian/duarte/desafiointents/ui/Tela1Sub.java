package willian.duarte.desafiointents.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import willian.duarte.desafiointents.R;

public class Tela1Sub extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela1_sub);

        Toast.makeText(getBaseContext(),"Hello "+getIntent().getStringExtra("name"),Toast.LENGTH_LONG).show();
    }
}
