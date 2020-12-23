package com.wj.prajumsook.controller;

import com.wj.prajumsook.entity.Film;
import com.wj.prajumsook.service.FilmApi;
import com.wj.prajumsook.service.SimpleFilmApi;
import io.reactivex.Observable;
import io.reactivex.Single;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Log4j2
@RestController
@RequestMapping(value = "/films")
@AllArgsConstructor
public class FilmController
{
//    @Autowired
//    private final FilmApi filmApi;

    @Autowired
    private final SimpleFilmApi simpleFilmApi;

//    @GetMapping("/{id}")
//    public Single<Film> findById(@PathVariable String id)
//    {
//        return filmApi.getFilmById(id);
//    }

    // You can request this api using "2baf70d1-42bb-4437-b551-e5fed5a87abe" as id
    @GetMapping("/simpleapi/{id}")
    public Film simpleFindById(@PathVariable String id)
    {
        return simpleFilmApi.getFilmById(id);
    }
//
//    @GetMapping
//    public Single<List<Film>> findAll()
//    {
//        return filmApi.getFilms();
//    }
//
//    @GetMapping(value = "/filmnames",produces = MediaType.APPLICATION_JSON_VALUE)
//    public Single<List<String>> findFilmNames()
//    {   return filmApi.getFilms()
//                      .toObservable()
//                      .flatMapIterable(list -> list)
//                      .map(film -> film.getTitle())
//                      .toList();
//    }
}
