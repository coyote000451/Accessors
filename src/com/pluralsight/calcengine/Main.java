package com.pluralsight.calcengine;

public class Main {


    public static void main(String[] args) {
        // write your code here
/*
       Flight Alex = new Flight;
        Alex.setSeats(1);
        int AlexSeats = Alex.getSeats();
        System.out.println(AlexSeats);

*/

        Flight Gyro = new Flight();
        Gyro.setSeats(3);
        int GyroSeats = Gyro.getSeats();
        //System.out.print("Gyro:   ");
        System.out.println("Gyro:   " + GyroSeats);

        Flight Alexis = new Flight(2, 2);
        Alexis.setSeats(1);
        int AlexisSeats = Alexis.getSeats();
        //System.out.print("Alexis: ");
        System.out.println("Alexis: " + AlexisSeats);
    }




}