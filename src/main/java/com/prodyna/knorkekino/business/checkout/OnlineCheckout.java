package com.prodyna.knorkekino.business.checkout;

import com.prodyna.knorkekino.business.payment.Paypal;

public class OnlineCheckout implements Checkout, Paypal {

    private int transactionId = 0;

    @Override
    public int getTransactionId() {
        return transactionId;
    }

    @Override
    public void performCheckoutProcedure() {
        transactionId++;
    }

    @Override
    public float getAmount() {
        return 120;
    }

    @Override
    public String getCurrency() {
        return "EUR";
    }

    @Override
    public int getPaypalId() {
        return 123;
    }
}
