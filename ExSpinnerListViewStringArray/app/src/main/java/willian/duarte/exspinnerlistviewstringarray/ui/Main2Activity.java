package willian.duarte.exspinnerlistviewstringarray.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

import willian.duarte.exspinnerlistviewstringarray.R;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    private Button btOk;
    private ListView lvContatos;

    private ArrayAdapter<String> adapter;
    private ArrayList<String> contatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        init();

        lvContatos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String contato = parent.getItemAtPosition(position).toString();
                toast("Clicou em: "+contato);
            }
        });

        lvContatos.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                String contato = parent.getItemAtPosition(position).toString();
                toast("Clicou e segurou em: "+contato);
                return true;
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.ma2_bt_ok:
                
                break;
        }
    }

    private void toast(String msg){
        Toast.makeText(getBaseContext(),msg,Toast.LENGTH_LONG).show();
    }

    private void init(){
        btOk = findViewById(R.id.ma2_bt_ok);
        lvContatos = findViewById(R.id.ma2_lv_contatos);

        btOk.setOnClickListener(this);

        contatos = new ArrayList<>();
        contatos.add("Manuel");
        contatos.add("João");
        contatos.add("Nyarons");
        contatos.add("Pewdiepie");

        adapter = new ArrayAdapter<String>(Main2Activity.this, android.R.layout.simple_list_item_1, contatos);

        lvContatos.setAdapter(adapter);
    }
}
