package com.example.apipost;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.gson.JsonObject;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class Alltrips extends AppCompatActivity {

    Button btn_trips;

    private List<GetSingleTripModel.Data> trip_data_array;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alltrips);

        btn_trips = (Button) findViewById(R.id.btn_trips);
        btn_trips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String token = "93849a89-f00a-4e7c-bb7d-bfbdf2347137";

                int id = 861;

                String str_Authorization = "Bearer 24776bee-af00-4c38-8322-4f6aa1e0b8b7";

                //

                final Retrofit retrofit = RetrofitClient.getClient(Constants.BASE_URL);
                RequestInterface login_details = retrofit.create(RequestInterface.class);

                Call<JsonObject> jsonObjectCall = login_details.getalltrips(token, str_Authorization, id);
                jsonObjectCall.enqueue(new Callback<JsonObject>() {
                    @Override
                    public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {


                        int rescode = response.code();


                        System.out.println("dgdgdgd" + rescode);


                        if (!response.isSuccessful()) {

                            if (response.code() != 200) {

                                if (response.code() != 500) {
                                    Toast.makeText(Alltrips.this, "Fail", Toast.LENGTH_SHORT).show();

                                }
                            }


                        } else {

                            if (response.code() == 200) {


                                Toast.makeText(Alltrips.this, "Sucess trip", Toast.LENGTH_SHORT).show();
                                JsonObject loginjsonObject = new JsonObject();
                                loginjsonObject = response.body();
                                JsonObject data = loginjsonObject.get("data").getAsJsonObject();
                                JsonObject Booking = data.get("Booking").getAsJsonObject();
                                JsonObject Detailed_price = Booking.get("detailedPrice").getAsJsonObject();
                                String prepaid = Detailed_price.get("prepaid").getAsString();
                                System.out.println("nerjtfj"+prepaid);



                            }


                        }
                    }

                    @Override
                    public void onFailure(Call<JsonObject> call, Throwable t) {

                        Toast.makeText(Alltrips.this, "Failure", Toast.LENGTH_SHORT).show();

                    }
                });
            }
        });
    }
}
