package com.methods;

public class OverloadFunc {
    public static void main(String[] args) {
        fun(67);
        fun(321, 13);
        fun("Ellie");

    }
    //Different function with same name can coexist if they have different arguments
    static void fun(int a){
        System.out.println("First one");
        System.out.println(a);
    }
    static void fun(int a, int b){
        System.out.println("Second one");
        System.out.println(a );
        System.out.println(b);

    }
    static void fun(String name){
        System.out.println("Third one");
        System.out.println(name);

    }
}
