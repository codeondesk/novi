package com.example.project1.ui.adapters;

import android.os.CountDownTimer;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.project1.R;
import com.example.project1.io.gamemodels.BetView;
import com.example.project1.io.gamemodels.Event;
import com.example.project1.io.headmodels.BetViews;
import com.example.project1.ui.Utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class GameAdapter extends RecyclerView.Adapter<GameAdapter.ItemViewHolder> {
    private List<Event> event;

    private int rowLayout=R.layout.games;

    public GameAdapter(List<Event> event) {
        this.setEvent(event);
    }

    public List<Event> getEvent() {return event;
    }

    public void setEvent(List<Event> event) {this.event = event;}




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
        holder.competitor1.setText(event.get(position).getAdditionalCaptions().getCompetitor1());
        holder.competitor2.setText(event.get(position).getAdditionalCaptions().getCompetitor2());
        holder.Elapsed.setText(event.get(position).getLiveData().getElapsed());

        String elapsedtimefinal =correctdateformer(event.get(position).getLiveData().getElapsed());
        holder.Elapsed.setText(elapsedtimefinal);
        System.out.println("GAME TIME: "+elapsedtimefinal);

    }

    public String correctdateformer(String former){

            Date createDate = Utils.toDate(former, "HH:mm:ss.SSSSSSS");

            if(createDate!=null){
                String formatedCreatedDate = Utils.toString(createDate, "HH:mm:ss");
                return formatedCreatedDate;
            }else{

                createDate = Utils.toDate(former, "SSSSSSSS.HH:mm:ss.SSSSSSS");
                String formatedCreatedDate = Utils.toString(createDate, "HH:mm:ss");
                return formatedCreatedDate;
            }



    }



    @Override
    public int getItemCount() {
        return event.size();
    }

}
