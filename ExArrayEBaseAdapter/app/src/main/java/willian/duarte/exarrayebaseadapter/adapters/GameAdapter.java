package willian.duarte.exarrayebaseadapter.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import willian.duarte.exarrayebaseadapter.R;
import willian.duarte.exarrayebaseadapter.model.Game;

public class GameAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<Game> games;
    private LayoutInflater inflater;

    public GameAdapter(Context context, ArrayList<Game> games) {
        this.context = context;
        this.games = games;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return games.size();
    }

    @Override
    public Game getItem(int position) {
        return games.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0; // useless
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null){
            convertView = inflater.inflate(R.layout.row,parent,false);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder); // stays in memory
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Game g = getItem(position);

        holder.tvGame.setText("Game: "+g.getGame());
        holder.tvPrice.setText("Price: "+g.getPrice());
        holder.tvSummerPrice.setText("Summer Sale: "+g.calcSummerSale());

        return convertView;
    }

    static class ViewHolder{
        private TextView tvGame;
        private TextView tvPrice;
        private TextView tvSummerPrice;

        public ViewHolder(View v){
            tvGame = v.findViewById(R.id.row_tv_game);
            tvPrice = v.findViewById(R.id.ma_et_price);
            tvSummerPrice = v.findViewById(R.id.row_tv_summer_price);
        }
    }
}
