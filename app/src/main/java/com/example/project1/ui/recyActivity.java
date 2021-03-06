package com.example.project1.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.project1.R;
import com.example.project1.io.APIClient;
import com.example.project1.io.gamemodels.Event;
import com.example.project1.io.gamemodels.GamesReceiver;
import com.example.project1.io.headmodels.BetViews;
import com.example.project1.io.headmodels.HeadLinesReceiver;
import com.example.project1.io.paths.GamesEndPoints;
import com.example.project1.io.paths.HeadlinesEndPoints;
import com.example.project1.ui.adapters.GameAdapter;
import com.example.project1.ui.adapters.HeadLineAdapter;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class recyActivity extends AppCompatActivity {
    static final String key = "tokenpassing";
    private Bundle extras;
    private String token;
    TextView gamecategory;
    RecyclerView recy1,recy2;
    private HeadLineAdapter headLinesAdapter;
    private GameAdapter gameAdapter;

    List<BetViews> headLines = new ArrayList<>();
    List<Event> events = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recy);
        tokenPass();
        gamecategory=(TextView)findViewById(R.id.gamecategory);
        recy1 = (RecyclerView) findViewById(R.id.HorizontialRecyclerView);
        recy2 = (RecyclerView) findViewById(R.id.VerticalRecyclerView);

        //Horizontial RecyclerView
        LinearLayoutManager horizontialManager = new LinearLayoutManager(recyActivity.this, LinearLayoutManager.HORIZONTAL, false);
        recy1.setLayoutManager(horizontialManager);
        headLinesAdapter = new HeadLineAdapter(headLines);
        recy1.setAdapter(headLinesAdapter);
        loadHeadLines();

        //Vertical RecyclerView
        LinearLayoutManager verticalManager = new LinearLayoutManager(this);
         recy2.setLayoutManager(verticalManager);
         gameAdapter = new GameAdapter(events);
         recy2.setAdapter(gameAdapter);
        startGamesCall();
    }

    private void loadHeadLines() {
        HeadlinesEndPoints apiService = APIClient.getClient().create(HeadlinesEndPoints.class);
        Call<List<HeadLinesReceiver>> call = apiService.getBetViews(token);
        call.enqueue(new Callback<List<HeadLinesReceiver>>() {
            @Override
            public void onResponse(Call<List<HeadLinesReceiver>> call, Response<List<HeadLinesReceiver>> response) {
                if(response.isSuccessful()){
                    headLines.clear();
                    headLines.addAll(response.body().get(0).getBetViews());
                    headLinesAdapter.notifyDataSetChanged();
                }else{
                    System.out.println("response failure response failure");
                }
            }
            @Override
            public void onFailure(Call<List<HeadLinesReceiver>> call, Throwable t) {
                Log.e("Call Failure Call Failure Call Failure", t.toString());
            }
        });
    }
    public void startGamesCall(){
        GamesEndPoints apiService = APIClient.getClient().create(GamesEndPoints.class);
        Call<List<GamesReceiver>> call = apiService.getGames(token);
        call.enqueue(new Callback<List<GamesReceiver>>() {
            @Override
            public void onResponse(Call<List<GamesReceiver>> call, Response<List<GamesReceiver>> response) {
                if(response.isSuccessful()){
                    //add caption category
                    gamecategory.setText(response.body().get(0).getBetViews().get(0).getCompetitions().get(0).getCaption());
                    events.clear();
                    events.addAll(response.body().get(0).getBetViews().get(0).getCompetitions().get(0).getEvents());
                    gameAdapter.notifyDataSetChanged();
                }else{
                    System.out.println("response failure response failure");
                }
            }
            @Override
            public void onFailure(Call<List<GamesReceiver>> call, Throwable t) {
                Log.e("Call Failure Call Failure Call Failure ", t.toString());
            }
        });
    }
    public void tokenPass(){
        extras = getIntent().getExtras();
        token = extras.getString(key);
        System.out.println("Received Token : "+token);
    }
}