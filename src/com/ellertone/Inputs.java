package com.ellertone;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.print("Please enter your roll no: ");
//        int rollno = input.nextInt();
//        System.out.println("Your roll number is: " + rollno);

//        int a = 10;
//        String name = input.nextLine();
//        System.out.println(name);

        int num1 = input.nextInt();
        int num2 = input.nextInt();

        int sum = num1 + num2;

        System.out.println("Sum =" +sum);
    }
}
