package com.bridgelabz.basics;

// Prime Number = When a number is divided by 1 or itself
// Programing Logic = Apart from 1 and itself divides the number with all its divisors,
// If it is divisible then enter inside isPrime = false and break, if it not divisible then it goes to isPrime = true

import java.util.Scanner;

public class PrimeNumber {
    static boolean checkPrimeNumber(int num) {
        boolean isPrime = true;   // isPrime store true let num = 7
        for (int i=2;i<num;i++){  // i = 2;i<7;true(why not 1 or <= , because it gives the remainder 0)
            if (num%i==0){        // 7%2==0 false it does not enter inside,then post increment goes to 6 and none of them can enter inside
                isPrime = false;  // only composite number enter inside
                break;
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the 'check prime number or not' program");
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number");
        int a = sc.nextInt();
        boolean b = checkPrimeNumber(a);
        if (b) System.out.println(a+ " is a Prime Number");
        else System.out.println(a + " is not a Prime Number");
    }
}
