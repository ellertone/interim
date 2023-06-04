package com.ellertone;

public class Conditions {
    public static void main(String[] args) {
        /* syntax
        if (condition T or F){
            do statement
        } else {
            do statement
        }

         */

        int salary = 45000;
        if (salary > 20000) {
            salary = salary + 3000;
        } else if(salary >10000) {
            salary += 2000;
        }
        else {
            salary = salary + 1000;

        }
        System.out.println(salary);
    }
}
