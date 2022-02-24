package com.prodyna.knorkekino.service.business;

import java.util.Collections;
import java.util.List;

public class Program {

    private List<Movie> movies = Collections.emptyList();

    public List<Movie> getMovies() {
        return movies;
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
    }
}
