package com.example.retrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface API {

    String BASE_URL = "https://jsonplaceholder.typicode.com/";

    @GET("posts")
    Call<List<User>> getHeroes();
}