package com.prodyna.knorkekino.architecture;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

import com.prodyna.knorkekino.service.monitoring.Monitored;
import com.prodyna.knorkekino.service.monitoring.Monitoring;
import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.lang.ArchRule;
import org.junit.jupiter.api.Test;

public class MonitoringArchitectureTests {
    // TODO 6: For legal reasons, all classes annotated with "@Monitored" must implement the interface "Monitoring"
    //          and must be placed in the service package.
    // TODO 7: Fix the violation
}
