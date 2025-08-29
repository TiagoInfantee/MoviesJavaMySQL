package com.tiagomovies.movies;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tiagomovies.movies.Models.Movie;
import com.tiagomovies.movies.Repository.MovieRepository;


@RestController
public class MoviesController {

    private final MovieRepository movieRepository;

    public MoviesController(MovieRepository movieRepository){
        this.movieRepository = movieRepository;
    }

    @GetMapping("/getallmovies")
    public List<Movie> getAllMovies(){
        List<Movie> movies = movieRepository.findAll();
        return movies;
    }


}
