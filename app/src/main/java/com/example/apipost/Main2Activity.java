package com.example.apipost;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class Main2Activity extends AppCompatActivity {

    EditText edt_email, edt_password, edt_phone;
    Button btn_register,btn_nesxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        edt_email = (EditText) findViewById(R.id.edt_email);
        edt_password = (EditText) findViewById(R.id.edt_password);
        edt_phone = (EditText) findViewById(R.id.edt_phone);
        btn_register = (Button) findViewById(R.id.btn_register);
        btn_nesxt = (Button) findViewById(R.id.btn_nesxt);

        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = edt_email.getText().toString();
                String password = edt_password.getText().toString();
                String phone = edt_phone.getText().toString();

                registerservice(email, password, phone);
            }
        });

        btn_nesxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Main2Activity.this,AndroidVresionsGet.class);
                startActivity(intent);
            }
        });


    }

    private void registerservice(String useremail, String userpassword, String userphone) {

        String stre = "93849a89-f00a-4e7c-bb7d-bfbdf2345347";

        RegisterRequest registerRequest = new RegisterRequest();
        registerRequest.setEmail(useremail);
        registerRequest.setPassword(userpassword);
        registerRequest.setTel(userphone);

        final Retrofit retrofit = RetrofitClient.getClient(Constants.BASE_URL);
        RequestInterface login_details = retrofit.create(RequestInterface.class);

        Call<RegisterResponce> jsonObjectCall = login_details.Getregister(stre, registerRequest);
        jsonObjectCall.enqueue(new Callback<RegisterResponce>() {
            @Override
            public void onResponse(Call<RegisterResponce> call, Response<RegisterResponce> response) {

                if (!response.isSuccessful()) {

                    if (response.code() != 200) {

                        if (response.code() != 500) {
                            Toast.makeText(Main2Activity.this, "Fail", Toast.LENGTH_SHORT).show();

                        }
                    }


                } else {

                    if (response.code() == 200) {
                        RegisterResponce registerResponce =response.body();


                        boolean created= registerResponce.getData().getCreated();

                        System.out.println("fjdnddn"+created);

                       /* JsonObject loginjsonObject = new JsonObject();
                        loginjsonObject = response.body();
                        JsonObject data_get = loginjsonObject.get("data").getAsJsonObject();
                        Boolean aBoolean = data_get.get("created").getAsBoolean();
                        Toast.makeText(Main2Activity.this, "Sucessregister", Toast.LENGTH_SHORT).show();*/

                    }


                }
            }

            @Override
            public void onFailure(Call<RegisterResponce> call, Throwable t) {

                Toast.makeText(Main2Activity.this, "Failure", Toast.LENGTH_SHORT).show();

            }
        });
    }
}
