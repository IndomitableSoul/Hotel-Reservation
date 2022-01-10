package com.hotelreservation.model;

import java.util.Comparator;

public class Hotel{
       private String name;
       private int weekdayRates;
       private int weekendRates;

        public Hotel(String name, int weekdayRates, int weekendRates) {
            this.name = name;
            this.weekdayRates = weekdayRates;
            this.weekendRates = weekendRates;
        }

        public void setName(String name) {
            this.name = name;
        }

    public void setWeekdayRates(int weekdayRates) {
        this.weekdayRates = weekdayRates;
    }

    public void setWeekendRates(int weekendRates) {
        this.weekendRates = weekendRates;
    }

    public String getName() {
            return name;
        }

    public int getWeekdayRates() {
        return weekdayRates;
    }

    public int getWeekendRates() {
        return weekendRates;
    }

    @Override
    public String toString() {
        return name;
    }

}
