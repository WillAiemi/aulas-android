package willian.duarte.exerciciosspinnerearrayadapter.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import willian.duarte.exerciciosspinnerearrayadapter.R;

public class Exercicio3 extends AppCompatActivity implements View.OnClickListener {

    private EditText etNome;
    private Button btOk;
    private ListView lvNomes;
    private ArrayList<String> nomes;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio3);

        init();

        lvNomes.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String click = parent.getItemAtPosition(position).toString();
                toast(click);
            }
        });
        lvNomes.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                String click = parent.getItemAtPosition(position).toString();
                toast(click.toUpperCase());
                return true;
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.ex3_bt_ok:
                if (etNome.getText().toString().isEmpty()){
                    toast("Digite um nome!");
                    etNome.setError("Digite um nome!");
                    return;
                }
                nomes.add(etNome.getText().toString());
                adapter.notifyDataSetChanged();
                toast(etNome.getText().toString()+" foi adicionado com sucesso!");
                limpar();
                break;
        }

    }

    private void limpar(){
        etNome.setText("");
    }

    private void init(){
        etNome = findViewById(R.id.ex3_et_nome);
        btOk = findViewById(R.id.ex3_bt_ok);
        btOk.setOnClickListener(this);
        lvNomes = findViewById(R.id.ex3_lv_nomes);

        nomes = new ArrayList<>();

        adapter = new ArrayAdapter<>(Exercicio3.this,android.R.layout.simple_list_item_1, nomes);

        lvNomes.setAdapter(adapter);
    }

    private void toast(String msg){
        Toast.makeText(getBaseContext(),msg,Toast.LENGTH_SHORT).show();
    }
}
