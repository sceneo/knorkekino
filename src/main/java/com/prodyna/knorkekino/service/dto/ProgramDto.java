package com.prodyna.knorkekino.service.dto;

import com.prodyna.knorkekino.business.program.Program;

@Dto
public class ProgramDto {

    private ProgramDto() {}

    public static ProgramDto from(Program program) {
        return new ProgramDto();
    }
}
