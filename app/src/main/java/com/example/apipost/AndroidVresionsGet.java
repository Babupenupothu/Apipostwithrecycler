package com.example.apipost;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class AndroidVresionsGet extends AppCompatActivity {

    RecyclerView recyclerview;
     ArrayList<AndroidVersionModel> data=new ArrayList<AndroidVersionModel>();

    String name, api, version;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_vresions_get);
        recyclerview = (RecyclerView) findViewById(R.id.recyclerview);

        loadjson();




    }

    private void loadjson() {

        final Retrofit retrofit = RetrofitClient.getClient(Constants.ANDROID_VERSION_BASE_URL);
        RequestInterface android_versions = retrofit.create(RequestInterface.class);

        Call<JsonObject> android_jsonObjectCall = android_versions.GetAndroidVersions();
        android_jsonObjectCall.enqueue(new Callback<JsonObject>() {
            @Override
            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {

                if (!response.isSuccessful()) {

                    if (response.code() != 200) {

                        if (response.code() != 500) {
                            Toast.makeText(AndroidVresionsGet.this, "Fail", Toast.LENGTH_SHORT).show();

                        }
                    }


                } else {

                    if (response.code() == 200) {

                        JsonObject androidjsonObject = response.body();
                        JsonArray jsonElements = androidjsonObject.get("android").getAsJsonArray();

                        for (int i = 0; i < jsonElements.size(); i++) {

                            JsonObject jo = jsonElements.get(i).getAsJsonObject();

                            version = jo.get("ver").getAsString();
                            name = jo.get("name").getAsString();
                            api = jo.get("api").getAsString();

                            AndroidVersionModel androidVersionModel = new AndroidVersionModel(version, name, api);

                            data.add(androidVersionModel);
                        }


                        RecylerAdapter recylerAdapter = new RecylerAdapter(data);
                        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager( AndroidVresionsGet.this );
                        mLayoutManager = new GridLayoutManager( AndroidVresionsGet.this, 1 );
                        recyclerview.setLayoutManager( mLayoutManager );
                        recyclerview.setAdapter( recylerAdapter );


                    }
                }
            }

            @Override
            public void onFailure(Call<JsonObject> call, Throwable t) {

            }
        });
    }
}
