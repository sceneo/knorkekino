package com.prodyna.knorkekino.business.checkout;

import com.prodyna.knorkekino.business.payment.Paypal;

public class RegisterCheckout implements Checkout, Paypal {

    private int transactionId = 123;
    private float amount = 12;

    @Override
    public int getTransactionId() {
        return transactionId;
    }

    @Override
    public void performCheckoutProcedure() {
        transactionId++;
        amount = 123123;
    }

    @Override
    public float getAmount() {
        return amount;
    }

    @Override
    public String getCurrency() {
        return "CHF";
    }

    @Override
    public int getPaypalId() {
        return 123123;
    }
}
