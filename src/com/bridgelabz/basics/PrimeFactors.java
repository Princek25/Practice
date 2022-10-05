package com.bridgelabz.basics;
import java.util.Scanner;

// Prime Factors of 16 = 1 2 4 8 16

public class PrimeFactors {
    public static void primeFactors(int n){
        for (int i =1;i<=n;i++){
            if (n%i==0){
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the 'Prime Factors' Program");
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number:- ");
        int n = sc.nextInt();
        primeFactors(n);
    }
}
