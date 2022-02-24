package com.prodyna.knorkekino.service;

import javax.inject.Inject;

public class PaymentWithCash implements PaymentMethod {

    @Inject
    PaymentService paymentService;

    void performPayment() {
        paymentService.payMyBill();
    }

    @Override
    public int getPaymentMethodId() {
        return 0;
    }

    @Override
    public double getAmount() {
        return 0;
    }
}
