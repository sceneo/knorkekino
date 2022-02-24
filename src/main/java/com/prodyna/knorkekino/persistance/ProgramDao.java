package com.prodyna.knorkekino.persistance;

import com.prodyna.knorkekino.service.business.Movie;
import com.prodyna.knorkekino.service.business.Program;

public class ProgramDao {

    // this call simulates a load procedure against the database
    public static Program loadProgram() {
        return getDummyProgram();
    }

    private static Program getDummyProgram() {
        Program program = new Program();
        program.addMovie(createMovie("Die Hard"));
        program.addMovie(createMovie("Die Hard 2"));
        program.addMovie(createMovie("Die Hard with a Vengeance"));
        return program;
    }

    private static Movie createMovie(String name) {
        return new Movie(name);
    }
}
