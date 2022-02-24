package com.prodyna.knorkekino.architecture;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.lang.ArchRule;
import org.junit.jupiter.api.Test;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

public class NamingArchitectureTest {

    JavaClasses importedClasses = new ClassFileImporter().importPackages("com.prodyna.knorkekino");

    @Test
    public void serviceClassNamesShouldEndOnService() {
        ArchRule rule = classes()
            .that()
            .areAnnotatedWith(Service.class)
            .should()
            .haveSimpleNameEndingWith("Service")
            .because("Services should be recognizable by their name, already on file level.");

        rule.check(importedClasses);
    }

    @Test
    public void restControllerNamesShouldEndOnController() {
        // TODO 1: Check that all existing rest controller (api endpoints) have a name ending with "Controller"
        // TODO 2: Fix the non-correct (there are 3) classes
    }
}
