package com.bridgelabz.basics;

// Prime Number = When a number is divided by 1 or itself
// Programing Logic = Apart from 1 and itself divides the number with all its divisors,
// If it is divisible then enter inside isPrime = false and break, if it not divisible then it goes to isPrime = true

public class PrimeNumber {
    static boolean checkPrimeNumber(int num) {
        boolean isPrime = true;
        for (int i=2;i<num;i++){
            if (num%i==0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {
        boolean b = checkPrimeNumber(12);
        if (b) System.out.println("It is a Prime Number");
        else System.out.println("It is not a Prime Number");
    }
}
