package com.example.android.retrofit1;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Hakimi on 4/2/2020.
 */
public interface JsonPlaceHolderApi {
    @GET("posts")
    Call <List<Post>> getPost();
}
