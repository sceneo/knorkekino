package com.prodyna.knorkekino.architecture;

import static com.tngtech.archunit.library.dependencies.SlicesRuleDefinition.slices;

import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchIgnore;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

@AnalyzeClasses(packages = "com.prodyna.knorkekino")
public class CyclicDependencyRulesTest {

    // TODO 12: Comment in this test and check if you have a cycle dependency inside your code
    // If you have: fix it!
    // If not: try adding one!
    @ArchIgnore
    @ArchTest
    static final ArchRule noCycleByMethodCallsBetweenSlices = slices().matching("com.prodyna.knorkekino.(*)..").should().beFreeOfCycles();
}
