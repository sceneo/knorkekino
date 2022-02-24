package com.prodyna.knorkekino.service.dto;

import com.prodyna.knorkekino.service.business.Program;

@Dto
public class ProgramDto {

    public ProgramDto() {}

    public static ProgramDto from(Program program) {
        return new ProgramDto();
    }
}
