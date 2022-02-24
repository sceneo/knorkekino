package com.prodyna.knorkekino.business.ticket;

import com.prodyna.knorkekino.business.hall.Hall;
import com.prodyna.knorkekino.business.movie.Movie;

public class Ticket {

    Hall hall;
    Movie movie;

    void assignTicketToSpecificMovie(Hall hall, Movie movie) {
        this.hall = hall;
        this.movie = movie;
    }
}
