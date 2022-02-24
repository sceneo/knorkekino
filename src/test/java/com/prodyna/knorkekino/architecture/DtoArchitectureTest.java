package com.prodyna.knorkekino.architecture;

import com.tngtech.archunit.junit.AnalyzeClasses;

@AnalyzeClasses(packages = "com.prodyna.knorkekino")
public class DtoArchitectureTest {
    // TODO 14: Due to some security issues all Dtos now must be annotated with the newly created annotation @Dto.
    //          As that is too much for a single migration (imagine that...), we only do that for the new ones, such
    //          as ReservationDto.
    //          Write a test that assures that all Dtos are annotated with @Dto

    // TODO 15: Use the freeze-rule (freeze()) to avoid the old parts being changed. You can use the standard
    //  configuration. Run the test (for the first time) with freeze.store.default.allowStoreCreation=true to create
    //  the store. use the archunit.properties file for that. Set it back to false after you have created your store

    // TODO 16: Try updating another Dto (add the correct Annotation) and rerun the test. Have a look at the store
    //  again. Make sure you can update the store

    // TODO 17: remove the annotation and rerun the test
    // TODO 18: Change an existing Dto and create a new Dto (with and without the annotation)

}
