package com.prodyna.knorkekino.persistence;

import static com.prodyna.knorkekino.service.ProgramService.filterMovieListByDieHardMovies;

import com.prodyna.knorkekino.persistence.entity.Movie;
import com.prodyna.knorkekino.persistence.entity.Program;
import java.sql.SQLException;

public class ProgramDao {

    // this call simulates a load procedure against the database
    public static Program loadProgram() {
        return getDummyProgram();
    }

    @Modifying
    public static void modifyProgram(Program program) {
        // remove all non-Die-Hard films from list
        program.clearMovieList();
        program.addMovies(filterMovieListByDieHardMovies(program));
    }

    @Modifying(flush = true, clear = true)
    public void updateProgram() {
        // do it!
    }

    @Modifying(flush = true)
    public void deleteProgram() {
        // delete
    }

    @Modifying(clear = true)
    public void doSomethingDifferentWithProgram() {
        // do it!
    }

    private void loadDatabaseStuff() throws SQLException {
        // do some DB stuff
    }

    private static Program getDummyProgram() {
        Program program = new Program();
        program.addMovie(createMovie("Die Hard"));
        program.addMovie(createMovie("Die Hard 2"));
        program.addMovie(createMovie("Die Hard with a Vengeance"));
        program.addMovie(createMovie("Batman"));
        program.addMovie(createMovie("Batman 2"));
        program.addMovie(createMovie("Batman begins"));
        return program;
    }

    private static Movie createMovie(String name) {
        return new Movie(name);
    }
}
