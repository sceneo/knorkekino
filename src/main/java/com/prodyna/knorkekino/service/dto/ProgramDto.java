package com.prodyna.knorkekino.service.dto;

import com.prodyna.knorkekino.persistence.entity.Program;

public class ProgramDto {

    public ProgramDto() {}

    public static ProgramDto from(Program program) {
        return new ProgramDto();
    }
}
