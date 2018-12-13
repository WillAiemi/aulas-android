package willian.duarte.exlistviewarrayadapter.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import willian.duarte.exlistviewarrayadapter.R;
import willian.duarte.exlistviewarrayadapter.model.Pessoa;

public class PessoaAdapter extends ArrayAdapter {

    private Context context;
    private ArrayList<Pessoa> pessoas;

    public PessoaAdapter(@NonNull Context context, ArrayList<Pessoa> pessoas) {
        super(context, 0, pessoas);

        this.context = context;
        this.pessoas = pessoas;

    }

    @NonNull
    @Override
    public View getView(int position,
                        @Nullable View convertView,
                        @NonNull ViewGroup parent) {

        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.linha_pessoa, null);
        }
        Pessoa p = pessoas.get(position);
        TextView tvNome = convertView.findViewById(R.id.lp_tv_nome);
        TextView tvIdade= convertView.findViewById(R.id.lp_tv_idade);
        TextView tvIdadeMeses = convertView.findViewById(R.id.lp_tv_idade_meses);
        tvNome.setText("Nome: "+p.getNome());
        tvIdade.setText("Idade: "+p.getIdade());
        tvIdadeMeses.setText("Idade em meses: "+p.calcularIdadeMeses());
        return convertView;
    }

}
