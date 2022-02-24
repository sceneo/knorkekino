package com.prodyna.knorkekino.business.payment;

public interface BankTransaction extends Payment {
    String getIban();
}
