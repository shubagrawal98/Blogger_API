package com.example.lovemom.blogger_api;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class Blogger_api {

    private static final String KEY = "AIzaSyBMoLUDTurS5AdNyLJRjtq0ci2gnm9tcDM";
    private static final String URL = "https://www.googleapis.com/blogger/v3/blogs/1088912437921686905/posts/";

    public static PostSerevice postSerevice = null;

    public static PostSerevice getPostSerevice() {
        if (postSerevice == null) {
            Retrofit builder = new Retrofit.Builder()
                    .baseUrl(URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            postSerevice = builder.create(PostSerevice.class);

        }
        return postSerevice;

    }

    public interface PostSerevice {

        @GET("?KEY" + KEY)
        Call<User> getpost();

    }


}
