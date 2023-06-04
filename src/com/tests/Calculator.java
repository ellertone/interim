package com.tests;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //take operator from user until pressing X or x

        while (true) {
            //enter operator
            System.out.println("Enter the operator for the calculation you wanna perform: ");
            char op = in.next().trim().charAt(0);
            int ans =0;

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.print("Enter two numbers: ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                if (op == '+'){
                    ans = num1 + num2;
                }
                if (op == '-'){
                    ans = num1 - num2;
                }
                if (op == '*'){
                    ans = num1 * num2;
                }
                if (op == '/'){
                    if (num2 !=0){
                    ans = num1 / num2;
                    }
                }
                if (op == '%'){
                    ans = num1 % num2;
                }
            } else if (op =='X' || op == 'x'){
                break;
            } else {
                System.out.println("Invalid operation");
            }
            System.out.println(ans);
        }

    }
}
