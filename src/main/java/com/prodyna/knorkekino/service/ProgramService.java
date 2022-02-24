package com.prodyna.knorkekino.service;

import static com.prodyna.knorkekino.persistance.ProgramDao.loadProgram;

import com.prodyna.knorkekino.service.business.Movie;
import com.prodyna.knorkekino.service.business.Program;
import com.prodyna.knorkekino.service.monitoring.Monitored;
import org.springframework.stereotype.Service;

@Service
@Monitored
public class ProgramService {

    private static final int businessId = 618;
    private Program program;

    public Movie getMovieByName(String name) {
        return program.getMovies().stream().filter(m -> m.getName().equals(name)).findFirst().get();
    }

    // your new colleague has added this code without speaking to anyone else in the department before.
    // this might look a bit messy, but it loads the program and prints the output to the console
    public void loadAndPrintProgram() {
        program = loadProgram();
        printMovies();
    }

    private void printMovies() {
        if (program == null) {
            throw new RuntimeException("Program could not be loaded");
        } else if (program.getMovies().isEmpty()) {
            throw new RuntimeException("No movie available");
        } else {
            program
                .getMovies()
                .forEach(m -> {
                    System.out.println("Found: " + m.toString());
                });
        }
    }
}
