package com.prodyna.knorkekino.service.monitoring;

import com.prodyna.knorkekino.service.PaymentService;
import javax.inject.Inject;

public class PaymentWithBankTransfer {

    @Inject
    PaymentService paymentService;

    void performPayment() {
        paymentService.payMyBill();
    }
}
