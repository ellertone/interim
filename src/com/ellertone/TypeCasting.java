package com.ellertone;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();
//        System.out.println(num);

//        typecasting
//        int num = (int)(234.23f);
//        System.out.println(num);

        //automatic type promotion in  expressions
//        int a = 257;
//        byte b = (byte)(a);


//        byte a = 40;
//        byte b =50;
//        byte c = 100;
//
//        int d = (a* b) / c; // for calculation it is promoted to integers the a and b bytes;
//        System.out.println(d);

//        int number ='A';
//        System.out.println(number);

        byte b = 32;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 54.456f;
        double d =0.1234;

        double result = (f * b) + (i / c) - (d -s);
        // float + int - double = double
        //the largest type is chosen

        System.out.println(((f * b) +" "+ (i / c) +" " + (d -s)));
        System.out.println(result);




    }
}