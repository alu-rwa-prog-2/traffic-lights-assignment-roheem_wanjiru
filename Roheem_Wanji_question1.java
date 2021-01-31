package com.company;

import java.util.ArrayList;
//Author @Adio Roheem
//this is where we are importing out random libary
import java.util.Random;

//this is where our class is for the program
public class Roheem_Wanji_question1 {
    //    this is where our variable called choose is being made
    static int choose;
    //    this is where our variable called leave is being made
    static int leave;
    //    this is where our variable called total is being given a constant of zero
    static int total = 0;
    //    this is where our variable called pop is being made
    static int pop;
    //    this is where our boolen are being given values
    static Boolean red = true;
    static Boolean green = false;
    static Boolean yellow = false;

    public static void main(String[] args) throws InterruptedException {
//        this is where we are calling on our arraylist
        ArrayList<Integer> cars = new ArrayList<Integer>();
//        this is where we are calling out random variable
        Random rand = new Random();
//        this is our while loop for the whole code
        while (!(total > 100)) {
//            this is our if statement for our red light
            if (red) {
//                this is where we are getting our time in seconds for our red light
                long time = System.currentTimeMillis();
                long end = time + 4000;
//                this is our while loop for the code for our red light
                while (System.currentTimeMillis() < end) {
                    System.out.println("Light: RED, wait for 20 seconds");
                    int number = 0;
                    while (number <= 4) {
                        choose = rand.nextInt(20);
                        cars.add(choose);
                        total += choose;
//                        this is our if statement for if our numbers exceed 80 or are 80 exactly
                        if (total >= 80) {
                            System.out.println(choose + " cars have joined the line");
                            System.out.println(total + " cars are in the total");
                            int rem = 100 - total;
                            total += rem;
                            cars.add(rem);
//                            this are our print statements for the condition that our cars are more than 80 and fast
//                            approaching 100
                            System.out.println("More cars have joined the line now, " +
                                    "unfortunately cars cant exceed 100");
                            System.out.println(total + " cars are on line now");
                            System.out.println("This is the maximum number of cars allowed");
                            System.out.println("All cars leaving now");
//                            this is where we exit our code once we have a 100 cars
                            System.exit(0);

                        }
//                        this are our print statements for our code when it is less than 80 and not yet
//                        approaching 100
                        System.out.println(choose + " cars have joined the line");
                        System.out.println(total + " cars are in the total");
                        number = number + 1;
//                        this is where we let our code pass out the time established
                        Thread.sleep(4000);
                    }
                }
//                this is where we instatiate our boolean values for our yellow light
                yellow = true;
                green = false;
                red = false;


            }
            //            this is our if statement for our red light
            if (yellow) {
//                this is our timing for our yellow light
                long t = System.currentTimeMillis();
                long end = t + 2000;
                while (System.currentTimeMillis() < end) {
//                    this is our print statement for our yellow light
                    System.out.println("Light:  YELLOW, go for 10 seconds");
                    int number = 0;
                    while (number <= 4) {
//                        this is our while loop for our yellow light
                        choose = 1;
                        cars.add(choose);
                        total += choose;
                        leave = 2;
                        cars.remove(leave);
                        total -= leave;
//                        this is where we print the status of cars going through our yellow light
                        System.out.println(leave + " cars have left");
                        System.out.println(choose + " cars have joined the line");
                        System.out.println(total + " cars in total");
                        number = number + 1;
                        Thread.sleep(2000);
                    }
                }
//                this is where we instantiate the boolean values for our green light
                green = true;
                yellow = false;
                red = false;
            }
//            this is our if statement for our green light
            if (green) {
//                this is where we start our timing for our green light
                long time = System.currentTimeMillis();
                long end = time + 6000;
//                this is our while loop for our while statement for our green light
                while (System.currentTimeMillis() < end) {
                    System.out.println("Light:  GREEN, go for 30 seconds");
                    int number = 0;
                    while (number <= 4) {
                        choose = 1;
                        cars.add(choose);
                        total += choose;
                        leave = 2;
                        cars.remove(leave);
                        total -= leave;
//                    this is our print statements for the status of the cars at our green light
                        System.out.println(leave + " cars have left");
                        System.out.println(choose + " cars have joined the line");
                        System.out.println(total + " cars in total");
                        number = number + 1;
                        Thread.sleep(6000);
                    }
                }
//                this is where we instantiate our red light boolean value for the while loop to go over again
                yellow = false;
                green = false;
                red = true;
            }
        }
    }
}