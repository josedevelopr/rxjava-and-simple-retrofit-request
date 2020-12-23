package com.wj.prajumsook.service;

import com.wj.prajumsook.entity.Film;
import io.reactivex.Observable;
import io.reactivex.Single;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import retrofit2.http.GET;
import retrofit2.http.Path;

import java.util.List;

public interface FilmApi
{   @GET("/films/{id}")
    Single<Film> getFilmById(@Path("id") String id);

    @GET("/films")
    Single<List<Film>> getFilms();
}
