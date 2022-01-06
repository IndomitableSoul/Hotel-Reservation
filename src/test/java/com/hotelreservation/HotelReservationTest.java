package com.hotelreservation;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class HotelReservationTest {
    @Test
    public void addHotelTest(){
        HotelReservation hotelReservation = new HotelReservation();
        boolean result = hotelReservation.addHotel();
       Assert.assertTrue(result);
    }
}
