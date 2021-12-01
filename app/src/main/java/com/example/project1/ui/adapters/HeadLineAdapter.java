package com.example.project1.ui.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.project1.R;
import com.example.project1.io.headmodels.BetViews;

import java.util.List;

public class HeadLineAdapter extends RecyclerView.Adapter<HeadLineAdapter.ItemViewHolder> {
    private List<BetViews> headLines;
    private int rowLayout=R.layout.headlines;

    //constructor
    public HeadLineAdapter(List<BetViews> headLines) {this.setHeadLines(headLines);}
    //geters seters
    public List<BetViews> getHeadLines() {return headLines;}
    public void setHeadLines(List<BetViews> headLines) {this.headLines = headLines;}

    public static class ItemViewHolder extends RecyclerView.ViewHolder {
        TextView competitor1Caption;
        TextView competitor2Caption;
        TextView startTime;
        Button buttonAssos,buttonDiplo,buttonXi;

        public ItemViewHolder(View itemView) {
            super(itemView);
            competitor1Caption = (TextView) itemView.findViewById(R.id.competitor1Caption);
            competitor2Caption = (TextView) itemView.findViewById(R.id.competitor2Caption);
            startTime = (TextView) itemView.findViewById(R.id.startTime);
            buttonAssos = (Button) itemView.findViewById(R.id.buttonAssos);
            buttonDiplo = (Button) itemView.findViewById(R.id.ButtonDiplo);
            buttonXi = (Button) itemView.findViewById(R.id.buttonXi);

        }
    }

    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(rowLayout, parent, false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ItemViewHolder holder, int position) {
        if(headLines.get(position).getCompetitor1Caption()!=null) {
            holder.competitor1Caption.setText(headLines.get(position).getCompetitor1Caption());
            holder.competitor2Caption.setText(headLines.get(position).getCompetitor2Caption());
            holder.startTime.setText(headLines.get(position).getStartTime());
        }else{
            holder.buttonAssos.setVisibility(View.GONE);
            holder.buttonDiplo.setVisibility(View.GONE);
            holder.buttonXi.setVisibility(View.GONE);
            System.out.println("marketing page!");
            holder.competitor1Caption.setText("marketing page!");
        }
    }

    @Override
    public int getItemCount() {
        return headLines.size();
    }

}
