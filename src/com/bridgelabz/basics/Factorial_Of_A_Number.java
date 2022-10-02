package com.bridgelabz.basics;
import java.util.Scanner;

// Factorial of a number eg:- 6 = 1x2x3x4x5x6 = 720

public class Factorial_Of_A_Number {
    static void factorialNumber(){
        int x=1;               // x = 1 multiply x with any number become that number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:- ");
        int a = sc.nextInt();  // Taking input from the user
        for(int i=1;i<=a;i++){ // Using for loop to print 1 to the user input number
            x=x*i;             // Multiply all the number and stored in x container
        }
        System.out.println("Factorial of "+ a + " is: " + x);
    }
    public static void main(String[] args) {
        factorialNumber();
    }
}
