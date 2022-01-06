package com.hotelreservation;

import com.hotelreservation.model.Hotel;

import java.util.ArrayList;
import java.util.Scanner;

public class HotelReservation {
    static Scanner sc = new Scanner(System.in);
    ArrayList<Hotel> hotels = new ArrayList<>();

    //UC1 Ability to add hotels to Hotel reservation
    public boolean addHotel(){
        hotels.add(new Hotel("LakeWood", 250));
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Welcome To Hotel Reservation Program");
    }
}
