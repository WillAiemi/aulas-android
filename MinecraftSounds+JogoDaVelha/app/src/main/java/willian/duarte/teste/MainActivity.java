package willian.duarte.teste;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button btWolf;
    private Button btCat;
    private MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Random random = new Random();
        btWolf = findViewById(R.id.bt_wolf);
        btCat = findViewById(R.id.bt_cat);

        btWolf.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                int randomNum = random.nextInt(2);
                if (randomNum == 1){
                    play(R.raw.howl1);
                } else {
                    play(R.raw.howl2);
                }
                Toast.makeText(
                        getBaseContext(),
                        "Wolf "+(1+randomNum),
                        Toast.LENGTH_LONG).show();
            }
        });

        btCat.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                int randomNum = random.nextInt(4);
                switch (randomNum){
                    case 0: play(R.raw.meow1);
                        break;
                    case 1: play(R.raw.meow2);
                        break;
                    case 2: play(R.raw.meow3);
                        break;
                    case 3: play(R.raw.meow4);
                        break;
                }
                Toast.makeText(
                        getBaseContext(),
                        "Cat "+(1+randomNum),
                        Toast.LENGTH_LONG).show();
            }
        });
    } //fecha onCreate

    public void play(int som){
        try {
            mp = MediaPlayer.create(this,som);
            mp.start();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
