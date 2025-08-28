package com.tiagomovies.movies;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import Models.Movie;


@RestController
public class MoviesController {

    @GetMapping("/getallmovies")
    public List<Movie> getAllMovies(){

        List<Movie> movies = new ArrayList<>();

        Movie conjuring = new Movie( 1,"Conjuring", "Terror", 2018);

        movies.add(conjuring);

        return movies;

    }

}
