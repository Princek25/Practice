package com.bridgelabz.basics;
import java.util.Scanner;

// Sum of the numbers in a range:
// Programing logic = Take two user input and print all the number from 1st input to 2nd input then add all.

public class Sum_Of_Number_In_Range {
    static void sumOfNumberInRange(){
        int i,sum=0;                          // Taking i,sum variable of int type, sum is declared with 0
        Scanner sc = new Scanner(System.in);  // Creating Object of Scanner
        System.out.println("Input a Range Starts from");  // Taking user input, the range of number starts from
        int a = sc.nextInt();                 // Calling Scanner object (sc) through int data type of (a) variable
        System.out.println("Input a Range Ends With");    // Taking user input, the range ends with
        int b = sc.nextInt();               // Calling Scanner object (sc) through int data type of (b) variable
        for (i=a;i<=b;i++){                 // Using for loops it will print all the number between a to b.
            sum+=i;                         // Sum of all the number in the range.
        }
        System.out.println("The sum of natural number from " + a + " to " + b + " is:- " + sum);
    }
    public static void main(String[] args) {
        sumOfNumberInRange();
    }
}
