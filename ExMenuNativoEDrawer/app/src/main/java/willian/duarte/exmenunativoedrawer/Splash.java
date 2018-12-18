package willian.duarte.exmenunativoedrawer;

import android.content.Intent;
import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

public class Splash extends AppCompatActivity {

    private static final int SPLASH_SCREEN_TIME_OUT = 3000;
    private int i = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);



        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent it = new Intent(Splash.this,MainActivity.class);
                startActivity(it);
                finish();
            }
        }, SPLASH_SCREEN_TIME_OUT);

        countdown();
    }// close onCreate

    private void countdown(){
        final ProgressBar progressBar;
        CountDownTimer timer;


        progressBar = findViewById(R.id.progressBar);
        progressBar.setProgress(i);
        timer = new CountDownTimer(3000,100) {
            @Override
            public void onTick(long millisUntilFinished) {
                i++;
                progressBar.setProgress((int)i*100/(3000/100));
            }

            @Override
            public void onFinish() {
                i++;
                progressBar.setProgress(100);
            }
        };
        timer.start();
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus){
            getWindow().getDecorView().setSystemUiVisibility(
                    View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                    |View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                    |View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                    |View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                    |View.SYSTEM_UI_FLAG_FULLSCREEN
                    |View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
            );
        }// close if
    }// close onWindowsFocusChanged();
}
