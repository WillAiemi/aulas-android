package willian.duarte.exerciciosspinnerearrayadapter.ui;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import willian.duarte.exerciciosspinnerearrayadapter.R;
import willian.duarte.exerciciosspinnerearrayadapter.model.Pessoa;

public class Exercicio4 extends AppCompatActivity implements View.OnClickListener {

    private EditText etNome;
    private EditText etIdade;
    private Button btOk;
    private ListView lvPessoas;
    private ArrayAdapter<Pessoa> adapter;
    private ArrayList<Pessoa> pessoas;
    private boolean result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio4);

        init();

        lvPessoas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.ex4_bt_ok:
                if (etNome.getText().toString().isEmpty()){
                    etNome.setError("Digite um nome...");
                    toast("Digite um nome...");
                    return;
                }
                if (etIdade.getText().toString().isEmpty()){
                    etIdade.setError("Digite uma idade...");
                    toast("Digite uma idade...");
                    return;
                }
                Pessoa p = new Pessoa();
                p.setNome(etNome.getText().toString());
                p.setIdade(Integer.parseInt(etIdade.getText().toString()));
                pessoas.add(p);
                adapter.notifyDataSetChanged();
                limpar();
                toast("Pessoa cadastrada com sucesso!");
                InputMethodManager imm = (InputMethodManager) getSystemService(Exercicio4.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(btOk.getWindowToken(),0);
                break;
        }
    }

    private void alert(String title, String msg, String positive, String negative){
        result = false;
        AlertDialog.Builder alert = new AlertDialog.Builder(getBaseContext());
        alert.setTitle(title);
        alert.setPositiveButton(positive, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                result = true;
            }
        });
        alert.setNegativeButton(negative,null);
        alert.show();
    }

    private void limpar(){
        etNome.setText("");
        etIdade.setText("");
    }

    private void init(){
        etNome = findViewById(R.id.ex4_et_nome);
        etIdade = findViewById(R.id.ex4_et_idade);
        btOk = findViewById(R.id.ex4_bt_ok);
        btOk.setOnClickListener(this);
        lvPessoas = findViewById(R.id.ex4_lv_pessoas);

        pessoas = new ArrayList<>();

        adapter = new ArrayAdapter<Pessoa>(Exercicio4.this,android.R.layout.simple_list_item_1,pessoas);

        lvPessoas.setAdapter(adapter);

    }

    private void toast(String msg){
        Toast.makeText(getBaseContext(),msg,Toast.LENGTH_SHORT).show();
    }
}
