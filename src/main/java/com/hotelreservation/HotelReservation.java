package com.hotelreservation;

import com.hotelreservation.model.Hotel;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.*;

public class HotelReservation {
    static Scanner sc = new Scanner(System.in);
    ArrayList<Hotel> hotels = new ArrayList<>();

    //UC1 Ability to add hotels to Hotel reservation
    //UC3 Ability to add weekend and weekday rates for each hotel
    public boolean addHotel(){
        hotels.add(new Hotel("LakeWood", 110, 90));
        hotels.add(new Hotel("BridgeWood", 160, 50));
        hotels.add(new Hotel("RidgeWood", 220, 150));
        return true;
    }

    //UC2 Ability to find the cheapest hotel on given date
    public boolean findCheapestHotelOnGivenDate() {

        System.out.println("Enter the date in YYYY-MM-DD format");
        System.out.println("Enter 1st date");
        String  enteredDate1 = sc.next();
        System.out.println("Enter 2nd date");
        String  enteredDate2 = sc.next();
        LocalDate date1 = LocalDate.parse(enteredDate1);
        LocalDate date2 = LocalDate.parse(enteredDate2);
        DayOfWeek day1 = date1.getDayOfWeek();
        DayOfWeek day2 = date2.getDayOfWeek();

        Hotel hotel = hotels.stream().min((n1, n2) -> n1.getWeekdayRates() - n2.getWeekdayRates()).orElse(null);
        System.out.println(hotel+" "+"$"+hotel.getWeekdayRates()*2);

        return true;
    }
    public static void main(String[] args) {
        System.out.println("Welcome To Hotel Reservation Program");
        HotelReservation hotelReservation = new HotelReservation();
        hotelReservation.addHotel();
        System.out.println(hotelReservation.hotels);
        hotelReservation.findCheapestHotelOnGivenDate();

    }
}
