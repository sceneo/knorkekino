package com.prodyna.knorkekino.service;

import static com.prodyna.knorkekino.facade.AmazingServiceFacade.doSomeIndependentStuff;

import org.springframework.stereotype.Service;

@Service
public class BookingService {

    public static void doSomeReallyCoolStuff() {
        doSomeIndependentStuff();
    }

    public void bookSeat() {}
}
