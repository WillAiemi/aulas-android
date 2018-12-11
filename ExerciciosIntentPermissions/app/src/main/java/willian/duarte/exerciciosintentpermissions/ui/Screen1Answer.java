package willian.duarte.exerciciosintentpermissions.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import willian.duarte.exerciciosintentpermissions.R;
import willian.duarte.exerciciosintentpermissions.model.Person;

public class Screen1Answer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen1_answer);

        if (getIntent().hasExtra("p")){
            Person p = getIntent().getParcelableExtra("p");
            Toast.makeText(getBaseContext(),"How's it going bro?"+p,Toast.LENGTH_LONG).show();
        }
    }
}