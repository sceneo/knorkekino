package com.prodyna.knorkekino.architecture;

import static com.tngtech.archunit.core.domain.JavaClass.Functions.GET_PACKAGE_NAME;
import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;
import static com.tngtech.archunit.library.plantuml.PlantUmlArchCondition.Configurations.consideringOnlyDependenciesInAnyPackage;
import static com.tngtech.archunit.library.plantuml.PlantUmlArchCondition.adhereToPlantUmlDiagram;

import com.tngtech.archunit.base.PackageMatchers;
import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchIgnore;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;
import java.net.URL;

@AnalyzeClasses(packages = "com.prodyna.knorkekino", importOptions = ImportOption.DoNotIncludeTests.class)
public class PlantUmlArchitectureTest {

    static final URL plantUmlDiagram = PlantUmlArchitectureTest.class.getClassLoader().getResource("example.puml");

    // TODO FP 1: Comment-in this test. Use PlantUML to define (parts of) your architecture. The file example.puml provides a first glance
    // on how this could be done. Try modifying the UML in such a way, that this test works (Note: this is normally not
    // the way one would do it...
    @ArchIgnore
    @ArchTest
    static final ArchRule classesShouldAdhereToExamplePlantUml = classes()
        .should(
            adhereToPlantUmlDiagram(
                plantUmlDiagram,
                consideringOnlyDependenciesInAnyPackage("controller..", "service..", "persistence..", "..facade..")
            )
                .ignoreDependenciesWithTarget(GET_PACKAGE_NAME.is(PackageMatchers.of("", "java..")).as("that is part of JDK"))
        );
}
