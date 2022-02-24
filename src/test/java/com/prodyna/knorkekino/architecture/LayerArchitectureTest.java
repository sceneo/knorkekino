package com.prodyna.knorkekino.architecture;

import static com.tngtech.archunit.library.Architectures.layeredArchitecture;

import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchIgnore;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

@AnalyzeClasses(packages = "com.prodyna.knorkekino", importOptions = { ImportOption.DoNotIncludeTests.class })
public class LayerArchitectureTest {

    // TODO 8: enable layering test and fix the issue
    @ArchIgnore
    @ArchTest
    static final ArchRule respectLayerDependencies = layeredArchitecture()
        .layer("Controllers")
        .definedBy("com.prodyna.knorkekino.controller..")
        .layer("Services")
        .definedBy("com.prodyna.knorkekino.service..")
        .layer("Persistence")
        .definedBy("com.prodyna.knorkekino.persistence..")
        .whereLayer("Controllers")
        .mayNotBeAccessedByAnyLayer()
        .whereLayer("Services")
        .mayOnlyBeAccessedByLayers("Controllers")
        .whereLayer("Persistence")
        .mayOnlyBeAccessedByLayers("Services");
}
