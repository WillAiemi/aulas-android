package willian.duarte.exerciciosspinnerearrayadapter.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import willian.duarte.exerciciosspinnerearrayadapter.R;

public class Exercicio2 extends AppCompatActivity {

    private ListView lvNomes;
    private ArrayList<String> nomes;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio2);

        init();

        lvNomes.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String click = parent.getItemAtPosition(position).toString();
                toast("Clicou em: "+click);
            }
        });

        lvNomes.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                String click = parent.getItemAtPosition(position).toString();
                toast("Clicou muito em: "+click);
                return true;
            }
        });
    }

    private void init(){
        lvNomes = findViewById(R.id.ex2_lv_nomes);
        nomes = new ArrayList<>();
        nomes.add("Poppy Harlow");
        nomes.add("Nyarons");
        nomes.add("Gabriella");
        nomes.add("Felix");
        nomes.add("João");
        nomes.add("Nicollas");
        nomes.add("Víctor");

        adapter = new ArrayAdapter<>(Exercicio2.this,android.R.layout.simple_list_item_1,nomes);

        lvNomes.setAdapter(adapter);
    }

    private void toast(String msg){
        Toast.makeText(getBaseContext(),msg,Toast.LENGTH_LONG).show();
    }
}
