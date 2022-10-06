package com.bridgelabz.day1practice;

public class StaticDemo {
    static int a = 12;
    public static void staticMethod(){
        System.out.println("Static Method");
        System.out.println(a + " is stored in a static variable");

    }
    static {
        System.out.println("Static Block");
    }
    public static void main(String[] args) {
        staticMethod();
    }
}
