package com.bridgelabz.basics;
import java.util.Scanner;

public class Sum_Of_Digits {
    public static void main(String[] args) {
        int sum = 0;    // Taking a variable sum of integer type initiate with zero
        Scanner sc = new Scanner(System.in);        // Scanner Object sc
        System.out.println("Input a Number");      // Taking a input from the user
        int a = sc.nextInt();
        while (a>0){                     // Using while loop a should be greater than 0
            int b = a%10;              // Taking another variable b and the remainder of a/10 stored in it.
            sum=sum+b;               // Another variable sum to add with b
            a=a/10;
        }
        System.out.println("Sum of digits of the number is:- " + sum);
    }
}
