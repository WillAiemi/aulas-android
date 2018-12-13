package willian.duarte.exarrayebaseadapter.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import willian.duarte.exarrayebaseadapter.R;
import willian.duarte.exarrayebaseadapter.adapters.GameAdapter;
import willian.duarte.exarrayebaseadapter.model.Game;

public class MainActivity extends AppCompatActivity {

    private EditText etGame;
    private EditText etPrice;
    private Button btOk;
    private ListView lvGames;
    private ArrayList<Game> games;
    private GameAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        btOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Game g = new Game();
                g.setGame(etGame.getText().toString());
                g.setPrice(Double.parseDouble(etPrice.getText().toString()));
                games.add(g);
                adapter.notifyDataSetChanged();
                toast("Game has been added to the store.");
            }
        });
    }// close onCreate();

    private void init(){
        etGame = findViewById(R.id.ma_et_game);
        etPrice = findViewById(R.id.ma_et_price);
        btOk = findViewById(R.id.ma_bt_ok);
        lvGames = findViewById(R.id.ma_lv_games);
        games = new ArrayList<>();
        adapter = new GameAdapter(MainActivity.this,games);
        lvGames.setAdapter(adapter);

    }// close init();

    private void toast(String msg){
        Toast.makeText(getBaseContext(),msg,Toast.LENGTH_LONG).show();
    }// close toast();
}
