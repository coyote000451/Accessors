package com.pluralsight.calcengine;

public class Flight {

        private int seats;
        private int passengers;

        public Flight ()
        {
            seats = 150;
            passengers = 0;
        }

        public Flight (int seats, int passengers)
        {

            this.seats = seats;
            this.passengers = passengers;
        }


        public int getSeats ()
        {
            return seats;
        }

        public void setSeats(int seats)
        {
            this.seats = seats;
        }

}
