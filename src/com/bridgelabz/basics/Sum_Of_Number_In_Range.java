package com.bridgelabz.basics;
import java.util.Scanner;         // Importing a scanner class

public class Sum_Of_Number_In_Range {
    public static void main(String[] args) {
        int i,sum=0;                          // Taking i,sum variable of int type, sum is declared with 0
        Scanner sc = new Scanner(System.in);  // Creating Object of Scanner
        System.out.println("Input a Range Starts from");  // Taking user input, the range of number starts from
        int a = sc.nextInt();                 // Calling Scanner object (sc) through int data type of (a) variable
        System.out.println("Input a Range Ends With");    // Taking user input, the range ends with
        int b = sc.nextInt();               // Calling Scanner object (sc) through int data type of (b) variable
        for (i=a;i<=b;i++){                 // Using for loops
            sum+=i;                         // Sum of the ranges of all the number
        }
        System.out.println("The sum of natural number from " + a + " to " + b + " is:- " + sum);

    }
}
