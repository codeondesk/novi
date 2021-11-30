package com.example.project1.ui.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.project1.R;
import com.example.project1.io.gamemodels.BetView;
import com.example.project1.io.headmodels.BetViews;
import com.example.project1.ui.Utils;

import java.util.Date;
import java.util.List;

public class GameAdapter extends RecyclerView.Adapter<GameAdapter.ItemViewHolder> {
    private List<BetView> games;
    private int rowLayout=R.layout.games;

    public GameAdapter(List<BetView> games) {
        this.setGames(games);
    }

    public List<BetView> getGames() {return games;}

    public void setGames(List<BetView> games) {this.games = games;}




    public static class ItemViewHolder extends RecyclerView.ViewHolder {


        TextView competitor1;
        TextView competitor2;
        TextView Elapsed;



        public ItemViewHolder(View itemView) {
            super(itemView);
            competitor1 = (TextView) itemView.findViewById(R.id.competitor1);
            competitor2 = (TextView) itemView.findViewById(R.id.competitor2);
            Elapsed = (TextView) itemView.findViewById(R.id.Elapsed);

        }
    }




    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(rowLayout, parent, false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ItemViewHolder holder, int position) {
        holder.competitor1.setText(games.get(0).getCompetitions().get(0).getEvents().get(position).getAdditionalCaptions().getCompetitor1());
        holder.competitor2.setText(games.get(0).getCompetitions().get(0).getEvents().get(position).getAdditionalCaptions().getCompetitor2());

       // holder.Elapsed.setText("timer: "+games.get(0).getCompetitions().get(0).getEvents().get(position).getLiveData().getElapsed());

        System.out.println("Ωραααααααααα: "+games.get(0).getCompetitions().get(0).getEvents().get(position).getLiveData().getElapsed());
        Date createDate = Utils.toDate(games.get(0).getCompetitions().get(0).getEvents().get(position).getLiveData().getElapsed(), "HH:mm:ss.SSSSSSS");
        String formatedCreatedDate = Utils.toString(createDate, "mm:ss");
        holder.Elapsed.setText(formatedCreatedDate);

    }

    @Override
    public int getItemCount() {
        return games.size();
    }

}
