package com.prodyna.knorkekino.architecture;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;
import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.methods;

import com.prodyna.knorkekino.service.dto.Dto;
import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;
import org.junit.jupiter.api.Test;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@AnalyzeClasses(packages = "com.prodyna.knorkekino.web.rest")
public class RestControllerArchitectureTest {
    // TODO 5: Make sure no RestController is in package com.prodyna.knorkekino.service

    /*
    @ArchTest
    static ArchRule onlyDtosShouldBeHandedOverToFrontend = methods()
        .that()
        .areDeclaredInClassesThat()
        .resideInAPackage("..business..")
        .and()
        .arePublic()
        .and()
        .areAnnotatedWith(GetMapping.class)
        .should()
        .beAnnotatedWith(Dto.class)
        .because("we do not want to couple the client code directly to the return types of the encapsulated module");

     */
}
