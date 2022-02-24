package com.prodyna.knorkekino.architecture;

import static com.tngtech.archunit.core.domain.Dependency.Predicates.dependency;
import static com.tngtech.archunit.core.domain.JavaClass.Functions.GET_PACKAGE_NAME;
import static com.tngtech.archunit.core.domain.JavaClass.Predicates.equivalentTo;
import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;
import static com.tngtech.archunit.library.plantuml.PlantUmlArchCondition.Configurations.consideringAllDependencies;
import static com.tngtech.archunit.library.plantuml.PlantUmlArchCondition.adhereToPlantUmlDiagram;

import com.prodyna.knorkekino.business.order.Order;
import com.prodyna.knorkekino.business.program.Program;
import com.prodyna.knorkekino.business.ticket.Ticket;
import com.tngtech.archunit.base.PackageMatchers;
import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;
import java.net.URL;
import org.junit.jupiter.api.Test;

@AnalyzeClasses(packages = "com.prodyna.knorkekino.business")
public class PlantUmlArchitectureTest {

    JavaClasses classesInBusiness = new ClassFileImporter().importPackages("com.prodyna.knorkekino.business");

    @Test
    public void classesShouldAdhereToExamplePlantUml() {
        URL plantUmlDiagram = PlantUmlArchitectureTest.class.getClassLoader().getResource("example.puml");
        ArchRule rule = classes()
            .should(
                adhereToPlantUmlDiagram(plantUmlDiagram, consideringAllDependencies())
                    .ignoreDependenciesWithOrigin(equivalentTo(Program.class))
                    .ignoreDependenciesWithTarget(GET_PACKAGE_NAME.is(PackageMatchers.of("", "java..")).as("that is part of JDK"))
                    .ignoreDependencies(
                        dependency(Ticket.class, Order.class)
                            .as(String.format("ignoring dependencies from %s to %s", Ticket.class.getName(), Order.class.getName()))
                    )
            );

        rule.check(classesInBusiness);
    }
}
