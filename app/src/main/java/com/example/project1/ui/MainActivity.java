package com.example.project1.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputFilter;
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
    private String token="6AANov3Vn6-a8--q9HTGBPLe-xTVZH3sbOSkuEseHHVzgcx9ILWUfRi1BOwWs65_6nraTCxZKtd2Cq29xy1AE8B9OjOQCNqmxpdBqBXUEe2drhng6jzcEtVXLrt84yb3XKbI5zETYlNygu7MnHN6c7Ek9KAX_ps0SWlue-QD6ariw6lpw4fzMjzqJbdy2ufei6q7VR8zU7AvfQJzGRi7Yw";
    public Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);

    }


    private void login(){
        Login loggedin = new Login(username.getText().toString(),password.getText().toString());
        LoginEndPoint apiService = APIClient.getClient().create(LoginEndPoint.class);
        Call<User> call = apiService.login(loggedin);
        call.enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {
                if(response.isSuccessful()){
                    token=response.body().getAccess_token();
                    System.out.println("TOKEN:"+token);
                    Toast toast = Toast.makeText(getApplicationContext(), "TOKENISHERE:"+token , Toast.LENGTH_SHORT);toast.show();
                }else{
                    System.out.println("NO TOKEN");
                    Toast toast = Toast.makeText(getApplicationContext(), "NO TOKEN" , Toast.LENGTH_SHORT);toast.show();

                }
            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {
                Log.e("token error", t.toString());
            }

        });

    }



    public void getToken(View view){
         login();
         i = new Intent(MainActivity.this, recyActivity.class);
         i.putExtra(recyActivity.key, token);
         startActivity(i);
    }

}