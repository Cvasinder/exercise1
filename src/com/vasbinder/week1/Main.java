package com.vasbinder.week1;
/*
1/17/19
Cam Vasbinder
Exercise 1
a program that gives a city name , zip code, and average high temps.
 */

public class Main {

    public static void main(String[] args) {
        int zip = 43123;
        String city = "Grove City";
        int dailyHighs[] = {33,24,15,14,19};
        double avgTemp = 0;
        double sum = 0;
        double total = 0;
            for (int i = 0 ; i <=4; i++) {
                total = total + dailyHighs[i];


        }
        avgTemp = total/5; 
        System.out.println("City: " + city + " Zip Code: " + zip + " Average High Temperature: " + avgTemp);


    }
    }

