package com.example.project1.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;

import com.example.project1.R;
import com.example.project1.io.APIClient;
import com.example.project1.io.gamemodels.BetView;
import com.example.project1.io.gamemodels.Event;
import com.example.project1.io.gamemodels.GamesReceiver;
import com.example.project1.io.headmodels.BetViews;
import com.example.project1.io.headmodels.HeadLines;
import com.example.project1.io.paths.GamesEndPoints;
import com.example.project1.io.paths.HeadlinesEndPoints;
import com.example.project1.ui.adapters.GameAdapter;
import com.example.project1.ui.adapters.HeadLineAdapter;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class recyActivity extends AppCompatActivity {
    static final String key = "usernamepass";
    private Bundle extras;
    private String token="6AANov3Vn6-a8--q9HTGBPLe-xTVZH3sbOSkuEseHHVzgcx9ILWUfRi1BOwWs65_6nraTCxZKtd2Cq29xy1AE8B9OjOQCNqmxpdBqBXUEe2drhng6jzcEtVXLrt84yb3XKbI5zETYlNygu7MnHN6c7Ek9KAX_ps0SWlue-QD6ariw6lpw4fzMjzqJbdy2ufei6q7VR8zU7AvfQJzGRi7Yw";
    RecyclerView recy1,recy2;
    private HeadLineAdapter headLinesAdapter;
    private GameAdapter gameAdapter;

    List<BetViews> headLines = new ArrayList<>();
    List<Event> events = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recy);
        tokenpass();
        recy1 = (RecyclerView) findViewById(R.id.HorizontialRecyclerView);
        recy2 = (RecyclerView) findViewById(R.id.VerticalRecyclerView);


        //List 1
        LinearLayoutManager horizontialManager = new LinearLayoutManager(recyActivity.this, LinearLayoutManager.HORIZONTAL, false);
        recy1.setLayoutManager(horizontialManager);
        headLinesAdapter = new HeadLineAdapter(headLines);
        recy1.setAdapter(headLinesAdapter);
        loadHeadLines();

        //List 2
        startGamesCall();
        recy2 = findViewById(R.id.VerticalRecyclerView);
        LinearLayoutManager verticalManager = new LinearLayoutManager(this);
         recy2.setLayoutManager(verticalManager);
         gameAdapter = new GameAdapter(events);
         recy2.setAdapter(gameAdapter);



    }

    private void loadHeadLines() {

        HeadlinesEndPoints apiService = APIClient.getClient().create(HeadlinesEndPoints.class);

        Call<List<HeadLines>> call = apiService.getBetViews(token);

        call.enqueue(new Callback<List<HeadLines>>() {
            @Override
            public void onResponse(Call<List<HeadLines>> call, Response<List<HeadLines>> response) {

                if(response.isSuccessful()){
                    List<BetViews> betviews = response.body().get(0).getBetViews();
                    for (BetViews betview : betviews) {
                        System.out.println("----------------------HEADLINES----------------------------------"+"\n"+
                                "---------------------------------------------------------------------"+"\n"+
                                "---------------------------------------------------------------------"+"\n"+
                                "Competitor1Caption: " + betview.getCompetitor1Caption()+"\n" +
                                "Competitor2Caption: " + betview.getCompetitor2Caption() +"\n"+
                                "StartTime:  " + betview.getStartTime()+"\n"+
                                "---------------------------------------------------------------------"+"\n"+
                                "---------------------------------------------------------------------"+"\n"
                        );
                    }
                    headLines.clear();
                    headLines.addAll(response.body().get(0).getBetViews());
                    headLinesAdapter.notifyDataSetChanged();


                }else{
                    System.out.println("response failure");
                }


            }

            @Override
            public void onFailure(Call<List<HeadLines>> call, Throwable t) {
                System.out.println("FAILURE FAILURE FAILURE FAILURE FAILURE FAILURE FAILURE FAILURE FAILURE FAILURE FAILURE FAILURE FAILURE FAILURE FAILURE FAILURE ");

            }
        });

    }





    public void startGamesCall(){
        GamesEndPoints apiService = APIClient.getClient().create(GamesEndPoints.class);
        Call<List<GamesReceiver>> call = apiService.getGames(token);

        call.enqueue(new Callback<List<GamesReceiver>>() {
            @Override
            public void onResponse(Call<List<GamesReceiver>> call, Response<List<GamesReceiver>> response) {
                //usersAdapter.updateData(response.body());
                events.clear();
                events.addAll(response.body().get(0).getBetViews().get(0).getCompetitions().get(0).getEvents());
                gameAdapter.notifyDataSetChanged();
                if(response.isSuccessful()){
                    List<Event> events = response.body().get(0).getBetViews().get(0).getCompetitions().get(0).getEvents();
                    for (Event event : events) {
                        System.out.println("----------------------GAMES----------------------------------"+"\n"+
                                "---------------------------------------------------------------------"+"\n"+
                                "---------------------------------------------------------------------"+"\n"+
                                "Competitor1: " + event.getAdditionalCaptions().getCompetitor1()+"\n" +
                                "Competitor2: " + event.getAdditionalCaptions().getCompetitor2()+"\n" +
                                "Elapsed:  " + event.getLiveData().getElapsed()+"\n"+
                                "---------------------------------------------------------------------"+"\n"+
                                "---------------------------------------------------------------------"+"\n"
                        );
                    }



                }else{
                    System.out.println("response failure");
                }
            }

            @Override
            public void onFailure(Call<List<GamesReceiver>> call, Throwable t) {
                // Log error here since request failed
                Log.e("Failure Failure Failure Failure Failure Failure Failure Failure Failure Failure Failure Failure Failure Failure ", t.toString());
            }

        });
    }
    public void tokenpass(){
        extras = getIntent().getExtras();
        token = extras.getString(key);
        System.out.println(token);
    }




}