package willian.duarte.exspinnerlistviewstringarray.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import willian.duarte.exspinnerlistviewstringarray.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Spinner spContatos;
    private Button btOk;
    private ListView lvContatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        lvContatos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){
                    toast("Selecione um contato!");
                    return;
                }
                String contato = parent.getItemAtPosition(position).toString();
                toast("Clicou em: "+contato);
            }
        });

        lvContatos.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0){
                    toast("Escolha um contato!");
                    return true;
                }
                String contato = parent.getItemAtPosition(position).toString();
                toast("Clicou e segurou em: "+contato);
                return true;
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.ma_bt_ok:
                if (spContatos.getSelectedItemPosition() == 0){
                    toast("Selecione um contato!");
                    return;
                }
                String contato = spContatos.getSelectedItem().toString();
                toast("Contato selecionado: "+contato);
                break;
        }
    }

    private void toast(String msg){
        Toast.makeText(getBaseContext(),msg,Toast.LENGTH_LONG).show();
    }

    private void init(){
        spContatos = findViewById(R.id.ma_sp_contatos);
        btOk = findViewById(R.id.ma_bt_ok);
        lvContatos = findViewById(R.id.ma_lv_contatos);

        btOk.setOnClickListener(this);

        spContatos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (position != 0){
                    String contato = spContatos.getSelectedItem().toString();
                    toast("Contato selecionado: "+contato);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}