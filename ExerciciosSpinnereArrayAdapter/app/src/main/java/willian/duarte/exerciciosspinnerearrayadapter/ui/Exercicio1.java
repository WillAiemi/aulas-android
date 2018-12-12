package willian.duarte.exerciciosspinnerearrayadapter.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import willian.duarte.exerciciosspinnerearrayadapter.R;

public class Exercicio1 extends AppCompatActivity implements View.OnClickListener{

    private Spinner spSexo;
    private Button btOk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio1);

        init();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.ex1_bt_ok:
                if (spSexo.getSelectedItemPosition() == 0){
                    toast("Selecione um sexo.");
                    return;
                }
                String sexo = spSexo.getSelectedItem().toString();
                toast("Você selecionou: "+sexo);
                break;
        }
    }

    private void toast(String msg){
        Toast.makeText(getBaseContext(),msg,Toast.LENGTH_LONG).show();
    }

    private void init(){
        spSexo = findViewById(R.id.ex1_sp_sexo);
        btOk = findViewById(R.id.ex1_bt_ok);
        btOk.setOnClickListener(this);

        spSexo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){
                    toast("Selecione um sexo.");
                    return;
                }
                String sexo = parent.getItemAtPosition(position).toString();
                toast("Você selecionou: "+sexo);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
