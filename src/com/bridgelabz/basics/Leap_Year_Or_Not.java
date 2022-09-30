package com.bridgelabz.basics;
import java.util.Scanner;

// 1. A leap year can be divisible by 4 and 100 both.
// 2. A leap year can be divisible by 4 only.
// 3. but a leap year cannot be divisible by 100 only.

public class Leap_Year_Or_Not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year:- ");
        int year = sc.nextInt();
        if (year%400==0){
            System.out.println(year + " is a leap year");
        } else if (year%100==0) {
            System.out.println(year + " is not a leap year");
        } else if (year%4==0) {
            System.out.println(year + " is a leap year");
        }
        else System.out.println(year + " is not a leap year");
    }
}
