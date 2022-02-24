package com.prodyna.knorkekino.persistence.entity;

import java.util.Collections;
import java.util.List;

public class Program {

    private List<Movie> movies = Collections.emptyList();

    public List<Movie> getMovies() {
        return movies;
    }

    public void clearMovieList() {
        movies.clear();
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public void addMovies(List<Movie> movies) {
        movies.addAll(movies);
    }
}
