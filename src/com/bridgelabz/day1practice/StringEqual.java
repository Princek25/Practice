package com.bridgelabz.day1practice;

// 1.3 Write a program to check two strings are equal or not.

public class StringEqual {
    public static void checkString(String a, String b){
        if (a==b){
            System.out.println("The Strings are equal");
        }
        else {
            System.out.println("The Strings are not equal");
        }

    }
    public static void main(String[] args) {
        System.out.println("Program to check two strings are equal or not");
        checkString("Cat", "Dog");
    }
}
