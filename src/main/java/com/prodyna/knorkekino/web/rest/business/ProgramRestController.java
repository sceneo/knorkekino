package com.prodyna.knorkekino.web.rest.business;

import com.prodyna.knorkekino.service.ProgramService;
import com.prodyna.knorkekino.service.dto.ProgramDto;
import javax.inject.Inject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/program")
public class ProgramRestController {

    @Inject
    ProgramService programService;

    @GetMapping(path = "/{id}")
    public ProgramDto getProgram(@RequestParam String movieName) {
        return new ProgramDto();
    }
}
