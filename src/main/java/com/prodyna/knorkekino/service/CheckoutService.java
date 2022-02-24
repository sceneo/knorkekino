package com.prodyna.knorkekino.service;

import javax.inject.Inject;
import org.springframework.stereotype.Service;

@Service
public class CheckoutService {

    @Inject
    PaymentService paymentService;

    @Inject
    BookingService bookingService;

    public void checkout() {
        bookingService.bookSeat();
        paymentService.payMyBill();
    }
}
