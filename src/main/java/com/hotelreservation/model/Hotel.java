package com.hotelreservation.model;

import java.util.Comparator;

public class Hotel implements Comparator<Hotel> {
       private String name;
       private int rates;

        public Hotel(String name, int rates) {
            this.name = name;
            this.rates = rates;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setRates(int rates) {
            this.rates = rates;
        }

        public String getName() {
            return name;
        }

        public int getRates() {
            return rates;
        }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compare(Hotel h1, Hotel h2) {
        return h1.rates - h2.rates;
    }
}
