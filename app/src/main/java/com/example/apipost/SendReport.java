package com.example.apipost;

import androidx.appcompat.app.AppCompatActivity;

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

public class SendReport extends AppCompatActivity {

    EditText edt_instantSpotted, edt_code, edt_value, edt_description, edt_other_damage;
    Button btn_submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_report);

        edt_instantSpotted = (EditText) findViewById(R.id.edt_instantSpotted);
        edt_code = (EditText) findViewById(R.id.edt_code);
        edt_value = (EditText) findViewById(R.id.edt_value);
        edt_description = (EditText) findViewById(R.id.edt_description);
        edt_other_damage = (EditText) findViewById(R.id.edt_other_damage);
        btn_submit = (Button) findViewById(R.id.btn_submit);

        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String instantSpotted = edt_instantSpotted.getText().toString();
                int instantSpotted1 = Integer.parseInt(instantSpotted);
                String code = edt_code.getText().toString();
                int code1 = Integer.parseInt(code);
                String value = edt_value.getText().toString();
                Boolean value1 = Boolean.valueOf(value);
                String description = edt_description.getText().toString();
                String submit = " [\"\"]";

                sendreport(instantSpotted1, code1, value1, description, submit);
            }
        });
    }

    private void sendreport(int inspotvalue, int code, Boolean value, String descrption, String other) {

        String str_Token = " 93849a89-f00a-4e7c-bb7d-bfbdf2347137";
        String str_Authorization = "Bearer 9c0f8566-90f3-4d88-b23e-6452f36847f8";
        String str_applicationjson = "application/json";
        SendRequestModel sendRequestModel = new SendRequestModel();
        sendRequestModel.setInstantSpotted(inspotvalue);
        sendRequestModel.setCode(code);
        sendRequestModel.setValue(value);
        sendRequestModel.setDescription(descrption);
        sendRequestModel.setOther_damage(other);
        final Retrofit retrofit = RetrofitClient.getClient(Constants.BASE_URL);
        RequestInterface send_report_details = retrofit.create(RequestInterface.class);
        Call<JsonObject> send_jsonObjectCall = send_report_details.GetSendRequest(str_Token, str_Authorization, sendRequestModel);
        send_jsonObjectCall.enqueue(new Callback<JsonObject>() {
            @Override
            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {


                int rescode = response.code();

                System.out.println("dgdgdgd" + rescode);


                if (!response.isSuccessful()) {

                    if (response.code() != 200) {

                        if (response.code() != 500) {
                            Toast.makeText(SendReport.this, "Fail", Toast.LENGTH_SHORT).show();

                        }
                    }


                } else {

                    if (response.code() == 200) {


                        Toast.makeText(SendReport.this, "Sucess", Toast.LENGTH_SHORT).show();

                       /* JsonObject loginjsonObject = new JsonObject();
                        loginjsonObject = response.body();
                        JsonObject data_get = loginjsonObject.get("data").getAsJsonObject();
                        Boolean aBoolean = data_get.get("created").getAsBoolean();
                        Toast.makeText(Main2Activity.this, "Sucessregister", Toast.LENGTH_SHORT).show();*/

                    }


                }
            }

            @Override
            public void onFailure(Call<JsonObject> call, Throwable t) {

                Toast.makeText(SendReport.this, "Failure", Toast.LENGTH_SHORT).show();

            }
        });
    }
}
