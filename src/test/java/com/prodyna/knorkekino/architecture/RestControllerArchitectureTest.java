package com.prodyna.knorkekino.architecture;

import com.tngtech.archunit.junit.AnalyzeClasses;

@AnalyzeClasses(packages = "com.prodyna.knorkekino.web.rest")
public class RestControllerArchitectureTest {
    // TODO 5: Make sure no RestController is in package com.prodyna.knorkekino.service

    // TODO: FP 2: Only Dtos should be handed over to frontend. Assure that with a test!
}
