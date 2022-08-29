package com.example.project1.Retrofit;
import com.google.gson.JsonObject;
import com.google.gson.GsonBuilder;
import com.google.gson.Gson;
import com.example.project1.Retrofit.Currency;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;


public interface RetrofitInterface {
    Gson gson = new GsonBuilder()
            .setDateFormat("yyyy-MM-dd HH:mm:ss")
            .create();

    RetrofitInterface retrofitInterface = new Retrofit.Builder()
            .baseUrl("https://v6.exchangerate-api.com/")
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()
            .create(RetrofitInterface.class);

    @GET("v6/a8383396420b4d81cdb0260d/latest/{cur}")
    Call<JsonObject> getExchangeCurrency(@Path("cur") String cur);


}