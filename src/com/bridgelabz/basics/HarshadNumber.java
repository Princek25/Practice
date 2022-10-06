package com.bridgelabz.basics;

// Harshad Number = sum of digits of a number which divides the number.
// Eg:- 18 = 1+8=9 which divides 18

import java.util.Scanner;

public class HarshadNumber {
    public static void checkHarshadNumber(int n){
        int sum =0, n1=n;  // make a copy of n = n1
        while (n!=0){        // let 18
            int r = n%10;   // r = 18%10 = 8
            sum = sum + r;   // sum = 0+8 = 8
            n = n/10;        // n = 18/10 = 1
        }
        if (n1%sum==0){
            System.out.println(n1 + " is a Harshad Number");
        }
        else {
            System.out.println(n1 + " is not a Harshad Number");
        }

    }

    public static void main(String[] args) {
        System.out.println("Welcome to the 'Harshad Number' Program");
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a Number");
        int n = sc.nextInt();
        checkHarshadNumber(n);
    }
}
