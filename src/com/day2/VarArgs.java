package com.day2;

import java.util.Arrays;

import static java.lang.IO.println;

public class VarArgs {
    static void main() {
//        fun(1,2,4,523,324,432,432,423);
        fun("ayush","ayush2");
        multiple(1,2,"ayush", "naveen");
    }


    //variable length must be at end
    static void multiple(int a , int b, String...v){
        System.out.println(Arrays.toString(v));
    }
    static void fun(String ...v){
      System.out.println(Arrays.toString(v));
    }

}
