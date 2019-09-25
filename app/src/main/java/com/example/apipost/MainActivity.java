package com.example.apipost;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    private EditText username,password;
    private String _email, _password;
    private String TAG = "LoginActivity";
    private Button btn_login,button2;
    private Context context;
    public static String BASE_URL = "https://core-govolt.2hire.io/v4/";
    public static String TOKEN = "93849a89-f00a-4e7c-bb7d-bfbdf2347137";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username=findViewById(R.id.editText1);

        password=findViewById(R.id.editText2);
        btn_login=findViewById(R.id.button1);
        button2=findViewById(R.id.button2);


        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                _email = username.getText().toString();
                _password = password.getText().toString();
                LoginSetviceCall(_email, _password);

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);

            }
        });



    }

    private void LoginSetviceCall(String email, String password) {

        boolean _isInternetAvailable = Constants.isInternetAvailable(context);

        if (!_isInternetAvailable) {


          /*  AppUtils.error_Alert("Per favore connettiti a intenet", context, alertDialog, LoginActivity.this);
            return;*/
        }

        // showProgressbar();
        String stre = "93849a89-f00a-4e7c-bb7d-bfbdf2345347";
        LoginRequest req = new LoginRequest();
        req.setUsername(email);
        req.setPassword(password);

        final Retrofit retrofit = RetrofitClient.getClient(Constants.BASE_URL);

        RequestInterface register_details = retrofit.create(RequestInterface.class);

        Call<JsonObject> resultRes = register_details.GetResponse(stre,req);
        resultRes.enqueue(new Callback<JsonObject>() {
            @Override
            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {

                // dismissProgressbar();

                if (!response.isSuccessful()) {
                    Log.e(TAG, "--Response code---" + response.code());
                    Log.e(TAG, "--Response ---" + response.body());


                    if (response.code() != 200) {
                        if (response.code() != 500) {
                            Toast.makeText(MainActivity.this, "Fail", Toast.LENGTH_SHORT).show();

                        }
                    }


                } else {
                    Log.e(TAG, "--Success---");


                    if (response.code() == 200) {

                        JsonObject jsonObject = response.body();


                        JsonObject get_data =jsonObject.get("data").getAsJsonObject();

                        JsonObject get_token =get_data.get("token").getAsJsonObject();

                        String Codde =get_token.get("code").getAsString();

                        int Userid =get_token.get("UserId").getAsInt();

                        Toast.makeText(getApplicationContext(),"Success",Toast.LENGTH_SHORT).show();








                    }
                       /* LoginResponse res = response.body();

                        String tokenid = null;
                        try {
                            tokenid = res.getData().getToken();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        System.out.println("gdggdgd"+tokenid);
                        // Log.e(TAG, "--ID ---" + res.getData().getToken().getId());

                        Toast.makeText(getApplicationContext(),"Success",Toast.LENGTH_SHORT).show();

                    }*/


                }
            }

            @Override
            public void onFailure(Call<JsonObject> call, Throwable t) {
                Log.e(TAG, "--Fail---" + t.getMessage());
                //  dismissProgressbar();

            }


        });
    }


}
