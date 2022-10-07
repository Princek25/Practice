package com.bridgelabz.basics;
import java.util.Scanner;

// Automorphic Number = A number that when squared ends with the number itself.
// Eg:- Square of 5 = 25 last digit = 5, and square of 76 = 5776 last two digits = 76.

public class AutomorphicNumber {
    public static void checkAutomorphicNumber(int n){
        int l = String.valueOf(n).length();
        //int l = (" "+n).length();       // storing length of the number n in l   // if n = 76 , l = 2
        int sq = n*n;                   // squaring of the number                // sq = 76*76 = 5776
        int e = sq%(int)Math.pow(10,l); // for last digit                        // e = 5776%100=76
        if (e==n){                      // if 76 = 76 then it will be automorphic number
            System.out.println(n + " is an Automorphic Number");
        }
        else {
            System.out.println(n + " is not an Automorpic Number");
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the 'Automorphic Number' Program");
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number:- ");
        int n = sc.nextInt();
        checkAutomorphicNumber(n);
    }
}
