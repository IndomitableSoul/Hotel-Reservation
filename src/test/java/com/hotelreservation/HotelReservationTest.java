package com.hotelreservation;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class HotelReservationTest {
    @Test
    public void givenToAddHotel_WhenAdded_ShouldReturnTrue(){
        HotelReservation hotelReservation = new HotelReservation();
        boolean result = hotelReservation.addHotel();
       Assert.assertTrue(result);
    }

    @Test
    public void givenToFindCheapestHotel_WhenFoundSuccessfully_ShouldReturnTrue() {
        HotelReservation hotelReservation = new HotelReservation();
        boolean result = hotelReservation.findCheapestHotelOnGivenDate();
        Assert.assertTrue(result);
    }
}
