package com.example.apipost;

import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface RequestInterface {

    @POST("user/login") //Here dot(.) means your final URL is the same as your base URL
    //Call<LoginResponse> GetResponse( @Header("X-SERVICE-TOKEN") String token, @Body LoginRequest request);

    Call<JsonObject> GetResponse(@Header("X-SERVICE-TOKEN") String token, @Body LoginRequest request);

    @POST("user/register")
    Call<RegisterResponce> Getregister(@Header("X-SERVICE-TOKEN") String token1,@Body RegisterRequest registerRequest);

    @POST("user/api/personal/vehicle/21/damage")
    Call<JsonObject> GetSendRequest(@Header("X-SERVICE-TOKEN") String xtoken, @Header("Authorization") String Authorization,@Body SendRequestModel sendRequestModel);

    @GET("user/api/personal/trip/{id}")
    Call<JsonObject> getalltrips(@Header("X-SERVICE-TOKEN") String st_token, @Header("Authorization") String Authorization,@Path("id") int id);

    @GET("android/jsonandroid")
    Call<JsonObject> GetAndroidVersions();


}