package com.prodyna.knorkekino.architecture;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.fields;
import static com.tngtech.archunit.library.GeneralCodingRules.*;

import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;
import java.util.logging.Logger;

// TODO 1: run this test and fix the outcome
@AnalyzeClasses(packages = "com.prodyna.knorkekino")
public class GlobalArchitectureTest {

    @ArchTest
    private final ArchRule noAccessToStandardStreams = NO_CLASSES_SHOULD_ACCESS_STANDARD_STREAMS;

    @ArchTest
    private final ArchRule noGenericExceptions = NO_CLASSES_SHOULD_THROW_GENERIC_EXCEPTIONS.because(
        "we always want to use explicit exceptions per usecase"
    );

    @ArchTest
    private final ArchRule doNotUseJodaTime = NO_CLASSES_SHOULD_USE_JODATIME;

    @ArchTest
    private final ArchRule loggersShouldBePrivateStaticFinal = fields()
        .that()
        .haveRawType(Logger.class)
        .should()
        .bePrivate()
        .andShould()
        .beStatic()
        .andShould()
        .beFinal()
        .because("we agreed on this convention");
}
