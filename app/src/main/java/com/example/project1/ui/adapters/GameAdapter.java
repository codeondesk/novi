package com.example.project1.ui.adapters;

import android.os.CountDownTimer;
import android.os.SystemClock;
import android.text.format.DateFormat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import com.example.project1.R;
import com.example.project1.io.gamemodels.BetView;
import com.example.project1.io.gamemodels.Event;
import com.example.project1.io.headmodels.BetViews;
import com.example.project1.ui.Utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class GameAdapter extends RecyclerView.Adapter<GameAdapter.ItemViewHolder> {
    private List<Event> event;
    private int rowLayout=R.layout.games;

    //constructor
    public GameAdapter(List<Event> event) {this.setEvent(event);}
    //geters seters
    public List<Event> getEvent() {return event;}
    public void setEvent(List<Event> event) {this.event = event;}

    public static class ItemViewHolder extends RecyclerView.ViewHolder {
        TextView competitor1;
        TextView competitor2;
        Chronometer Elapsed1;
        Button button1;
        Button button2;
        public ItemViewHolder(View itemView) {
            super(itemView);
            competitor1 = (TextView) itemView.findViewById(R.id.competitor1);
            competitor2 = (TextView) itemView.findViewById(R.id.competitor2);
            Elapsed1 = (Chronometer)itemView.findViewById(R.id.chronometer);
            button1 = (Button) itemView.findViewById(R.id.button1);
            button2 = (Button) itemView.findViewById(R.id.button2);

        }
    }

    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(rowLayout, parent, false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ItemViewHolder holder, int position) {
        holder.competitor1.setText(event.get(position).getAdditionalCaptions().getCompetitor1());
        holder.competitor2.setText(event.get(position).getAdditionalCaptions().getCompetitor2());

        if(!event.get(position).getMarkets().isEmpty())
        {
        holder.button1.setText("1             "+event.get(position).getMarkets().get(1).getBetItems().get(0).getOddsText());
        holder.button2.setText("2             "+event.get(position).getMarkets().get(1).getBetItems().get(1).getOddsText());
        }else{
            System.out.println("---------------null market team-----------------");

        }

        //date edit format for update
        String elapsedtimefinal =Utils.correctdateformer(event.get(position).getLiveData().getElapsed()); //Format Type: "HH:MM:SS"
        String[] tokens = elapsedtimefinal.split(":");
        int hours = Integer.parseInt(tokens[0]);
        int minutes = Integer.parseInt(tokens[1]);
        int seconds = Integer.parseInt(tokens[2]);
        System.out.println("---------------Time Spliting: Hours: "+hours+" Minutes: " + minutes +" Seconds: "+ seconds+"-----------------");
        holder.Elapsed1.setBase(SystemClock.elapsedRealtime() - ( hours * 3600000  +  minutes * 60000     +       seconds * 1000));
        holder.Elapsed1.start();
    }



    @Override
    public int getItemCount() {
        return event.size();
    }
}
