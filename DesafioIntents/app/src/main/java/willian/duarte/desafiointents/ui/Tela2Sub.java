package willian.duarte.desafiointents.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import willian.duarte.desafiointents.R;
import willian.duarte.desafiointents.model.Person;

public class Tela2Sub extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2_sub);

        Person p = getIntent().getParcelableExtra("p");
        Toast.makeText(getBaseContext(),"Hello "+p,Toast.LENGTH_LONG).show();
    }
}
