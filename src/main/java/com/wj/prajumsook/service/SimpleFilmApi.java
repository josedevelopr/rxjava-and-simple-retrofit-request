package com.wj.prajumsook.service;

import com.wj.prajumsook.entity.Film;
import io.reactivex.Single;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface SimpleFilmApi
{   @GET("/films/{id}")
    Film getFilmById(@Path("id") String id);
}
