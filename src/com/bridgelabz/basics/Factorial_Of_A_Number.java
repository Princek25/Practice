package com.bridgelabz.basics;
import java.util.Scanner;

public class Factorial_Of_A_Number {
    public static void main(String[] args) {
        int x=1;     // x = factorial
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:- ");
        int a = sc.nextInt();  // Taking input from the user
        for(int i=1;i<=a;i++){ // Using for loop to print 1 to the user input number
            x=x*i;             // Multiply all the number
        }
        System.out.println("Factorial of "+ a + " is: " + x);

    }
}
