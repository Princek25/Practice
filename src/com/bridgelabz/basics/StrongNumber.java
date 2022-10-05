package com.bridgelabz.basics;
import java.util.Scanner;

// Strong Number Logic:-
// 145 =1! + 4! + 5! = 1 + 24 + 120 = 145

public class StrongNumber {
    public static void checkStrongNumber(int n){
        int sum = 0,n1=n; // n1 is copy of n for comparison
        while (n!=0){
            int r = n%10;  // for last digit
            sum = sum + Factorial.factorialNumber(r);
            n=n/10;   // it will remove last digit
        }
        if (sum==n1){
            System.out.println("Strong Number");
        }
        else {
            System.out.println("Not a Strong Number");
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the 'Strong Number' Program");
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a Number");
        int n = sc.nextInt();
        checkStrongNumber(n);
    }
}
