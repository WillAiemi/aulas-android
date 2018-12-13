package willian.duarte.exlistviewarrayadapter.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import willian.duarte.exlistviewarrayadapter.R;
import willian.duarte.exlistviewarrayadapter.adapters.PessoaAdapter;
import willian.duarte.exlistviewarrayadapter.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    private EditText etNome;
    private EditText etIdade;
    private Button btOk;
    private ListView lvPessoas;

    private ArrayList<Pessoa> pessoas;
    private PessoaAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        btOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pessoa p = new Pessoa();
                p.setNome(etNome.getText().toString());
                p.setIdade(Integer.parseInt(etIdade.getText().toString()));

                pessoas.add(p);
                adapter.notifyDataSetChanged();
                toast("Pessoa cadastrada com sucesso!");
            }
        });
    }

    private void init(){
        etNome = findViewById(R.id.ma_et_nome);
        etIdade = findViewById(R.id.ma_et_idade);
        btOk = findViewById(R.id.ma_bt_ok);
        lvPessoas = findViewById(R.id.ma_lv_pessoas);

        pessoas = new ArrayList<>();

        adapter = new PessoaAdapter(MainActivity.this,pessoas);
        lvPessoas.setAdapter(adapter);

    }

    private void toast(String msg){
        Toast.makeText(getBaseContext(),msg,Toast.LENGTH_SHORT).show();
    }
}
