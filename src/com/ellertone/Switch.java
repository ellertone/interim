package com.ellertone;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        System.out.println("Please Enter a villagers name in Dr. Stone: ");
        Scanner in = new Scanner(System.in);

        String villager = in.next();
        /*
        Nested Switches available
        Days of the week
        * month
        * switch without select breaks is like for deciding between weekends and weekdays
        *
        * */
        int day = in.nextInt();
        switch (day){
            case 1, 2, 3 , 4 , 5 -> System.out.println("Weekday");
            case 6,7 -> System.out.println("Weekend");
        }

        switch (villager) {
            case "Chrome" -> System.out.println("Science user");
            case "Senku" -> System.out.println("Ten Billion points.");
            case "Kohaku" -> System.out.println("Lioness, Gorilla");
            case "Taiju" -> System.out.println("Big oaf");
            case "Tsukasa" -> System.out.println("Strongest primate highschooler.");
            default -> System.out.println("Not a Big-shot in stoneworld ");

        }



    }
}
