package com.prodyna.knorkekino.architecture;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

import com.prodyna.knorkekino.business.checkout.Checkout;
import com.prodyna.knorkekino.business.payment.Payment;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

@AnalyzeClasses(packages = "com.prodyna.knorkekino.business")
public class BusinessRestrictionArchitectureTest {

    @ArchTest
    static final ArchRule classesThatImplementTheCheckoutInterfaceShouldAlsoImplementAtLeastOnePaymentInterface = classes()
        .that()
        .implement(Checkout.class)
        .should()
        .implement(Payment.class)
        .because("Every checkout procedure must also implement at least one payment interface");
}
