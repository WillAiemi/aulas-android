package willian.duarte.exintentexplicitaobjetotarde.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import willian.duarte.exintentexplicitaobjetotarde.R;
import willian.duarte.exintentexplicitaobjetotarde.model.Produto;

public class Tela1Resposta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela1_resposta);

        if (getIntent().hasExtra("p")){
            Produto p = getIntent().getParcelableExtra("p");
            Toast.makeText(getBaseContext(),"Produto: "+p,Toast.LENGTH_LONG).show();
        }
    }
}
