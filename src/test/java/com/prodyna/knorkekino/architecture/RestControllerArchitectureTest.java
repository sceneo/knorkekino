package com.prodyna.knorkekino.architecture;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.methods;

import com.prodyna.knorkekino.service.dto.Dto;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;
import org.springframework.web.bind.annotation.GetMapping;

@AnalyzeClasses(packages = "com.prodyna.knorkekino.web.rest.business")
public class RestControllerArchitectureTest {

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
}
