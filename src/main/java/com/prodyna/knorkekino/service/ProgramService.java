package com.prodyna.knorkekino.service;

import com.prodyna.knorkekino.business.program.Program;
import java.util.Collections;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ProgramService {

    List<Program> movies = Collections.emptyList();

    public Program getProgramById(int programId) {
        return movies.stream().filter(m -> m.getProgramId() == programId).findFirst().get();
    }
    // TODO: your new colleague has added some unfinished work. Please comment-in his
    // "precious" code and find out if it allignes with our architeture guidelines

    /*
    public void loadProgram() {
     // I couldn't implement that so far
         movies.addAll(List.of("Die Hard", "Die Hard 2", "Die Hard with a vengeance"));
        printMovies();
    }

    private void printMovies(){
        if(movies.isEmpty()){
            throw new RuntimeException("Did not find movies");
        }
        else {
            System.out.println("Found: " + movies.toString());
        }
    }
*/

}
