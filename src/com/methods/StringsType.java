package com.methods;

import java.util.Scanner;

public class StringsType {

    public static void main(String[] args) {
//        String message = greet();
//        System.out.println(message);
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name:" );
        String name = in.next();
        String personal = myGreet(name);
        System.out.println(personal);
        }

    static String myGreet(String name ){
        String message = "Hello "+name;
        return message;
    }


    static String greet() {
        String greeting = "Hello Ellertone";
        return greeting;
    }
}