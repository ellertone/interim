package com.ellertone;

import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter Temp in C: ");
        float tempC = input.nextFloat(); // also = in.nextFloat()

        float tempF = (tempC * 9/5) + 32;

        System.out.println("Temp in Degrees Fahrenheit is: "+ tempF );


    }
}
