package com.example.project1.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.project1.R;
import com.example.project1.io.APIClient;
import com.example.project1.io.Login;
import com.example.project1.io.User;
import com.example.project1.io.paths.LoginEndPoint;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    EditText username,password;
    public Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);

    }
    private  void login (){
        Login loggedin = new Login(username.getText().toString(),password.getText().toString());
        LoginEndPoint apiService = APIClient.getClient().create(LoginEndPoint.class);
        Call<User> call = apiService.login(loggedin);
        call.enqueue(new Callback<User>() {
            private String token="";
            private String tokenType="";
            @Override
            public void onResponse(Call<User> call, Response<User> response) {
                if(response.isSuccessful()){
                    token=response.body().getAccess_token();
                    tokenType=response.body().getToken_type();
                    System.out.println("TOKEN RECEIVED: "+token);
                    Toast.makeText(getApplicationContext(), "Login Successful Token Received"+"\n"+tokenType+"\n"+token,Toast.LENGTH_LONG).show();
                    //perasma se allh activity
                    i = new Intent(MainActivity.this, recyActivity.class);
                    i.putExtra(recyActivity.key, token);
                    startActivity(i);
                }else{
                    System.out.println("NO TOKEN FROM SERVER");
                    Toast.makeText(getApplicationContext(), "NO TOKEN FROM SERVER" ,Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {
                Log.e("token error", t.toString());
                System.out.println("NO TOKEN FROM CONNECTION");
                Toast.makeText(getApplicationContext(), "NO TOKEN FROM CONNECTION" ,Toast.LENGTH_LONG).show();

            }
        });
    }
    public void getToken(View view){ login(); }

}