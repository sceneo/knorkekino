package com.prodyna.knorkekino.service;

import static com.prodyna.knorkekino.persistence.ProgramDao.loadProgram;

import com.prodyna.knorkekino.persistence.entity.Movie;
import com.prodyna.knorkekino.persistence.entity.Program;
import com.prodyna.knorkekino.service.monitoring.Monitored;
import java.util.List;
import java.util.stream.Collectors;
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

    public static List<Movie> filterMovieListByDieHardMovies(Program program) {
        return program.getMovies().stream().filter(m -> m.getName().contains("Die Hard")).collect(Collectors.toList());
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
