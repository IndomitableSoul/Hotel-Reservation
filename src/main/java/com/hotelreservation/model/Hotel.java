package com.hotelreservation.model;

public class Hotel {
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
}
