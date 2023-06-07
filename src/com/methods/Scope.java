package com.methods;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b=  20;
        //block cannot reinitialize a value
        {
            a= 2020; //reassign original reference var to another value

            int c = 20;
            System.out.println(a);
            //used only inside block
        }
        //created values within blocks cannot be used outside of it
        System.out.println(a);

        //scoping in for loops
        for (int i = 0; i< 4; i++ ){
            int d = 40;
            System.out.println(i);
        }
        int d = 400;
    }
}
