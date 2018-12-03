package willian.duarte.exaula5tarde;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Toast.makeText(MainActivity.this,getResources().getText(R.string.toast_hello),Toast.LENGTH_LONG).show();
        AlertDialog.Builder msg = new AlertDialog.Builder(MainActivity.this);
        msg.setTitle(getResources().getText(R.string.alert_title));
        msg.setMessage(getResources().getText(R.string.alert_message));
        msg.setIcon(ContextCompat.getDrawable(MainActivity.this, R.mipmap.ic_launcher));
        msg.setNeutralButton(getResources().getText(R.string.alert_neutral_button), null);
        msg.show();
    }//fecha onCreate

}//fecha MainActivity