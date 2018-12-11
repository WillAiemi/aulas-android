package willian.duarte.exintentexplicitaobjetotarde.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import willian.duarte.exintentexplicitaobjetotarde.R;
import willian.duarte.exintentexplicitaobjetotarde.model.Produto;


public class Tela1 extends AppCompatActivity {

    private EditText etNome;
    private EditText etValor;
    private Button btOk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela1);

        init();

        btOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Produto p = new Produto();
                p.setNome(etNome.getText().toString());
                p.setValor(Double.parseDouble(etValor.getText().toString()));

                Intent it = new Intent(Tela1.this,Tela1Resposta.class);

                it.putExtra("p",p);
                startActivity(it);
            }
        });
    }// close onCreate()

    private void init(){
        etNome = findViewById(R.id.t1_et_nome);
        etValor = findViewById(R.id.t1_et_valor);
        btOk = findViewById(R.id.t1_bt_ok);
    }// close init()
}// close Tela1
