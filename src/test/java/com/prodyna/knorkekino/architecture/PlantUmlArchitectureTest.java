package com.prodyna.knorkekino.architecture;

import com.tngtech.archunit.junit.AnalyzeClasses;

@AnalyzeClasses(packages = "com.prodyna.knorkekino.business")
public class PlantUmlArchitectureTest {
    /*
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

 */
}
