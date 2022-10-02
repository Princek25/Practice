package com.bridgelabz.basics;
import java.util.Scanner;

// Leap year concept:
// 1. A leap year is divisible by 4 and a non leap year is not divisible by 4.
// 2. Problem: 1900 is a non leap year which is divisible by 4.
// 3. Then for century leap year, is divisible by 400.
// 4. A leap year cannot be divisible by 100.

public class Leap_Year_Or_Not {
    static void leapYear(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year:- ");
        int year = sc.nextInt();
        if (year%400==0){          // A leap year is divisible by 400 means remainder is 0.
            System.out.println(year + " is a leap year");
        } else if (year%100==0) {  // A non leap is divisible by 100 means remainder is 0.
            System.out.println(year + " is not a leap year");
        } else if (year%4==0) {    // A leap year is divisible by 4 means remainder is 0.
            System.out.println(year + " is a leap year");
        }
        else System.out.println(year + " is not a leap year");
    }
    public static void main(String[] args) {
        leapYear();
    }
}
