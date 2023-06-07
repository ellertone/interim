package com.methods;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        //fun( 4, 4,23,23 ,53,234,5625,5 ,345,32, 534);
        multiple(2,3, 45,13,25);
    }

    static void multiple(int a, int b, int ...v){

    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
