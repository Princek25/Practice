package com.bridgelabz.basics;
import java.util.Scanner;

// Factorial of a number eg:- 6 = 1x2x3x4x5x6 = 720

public class Factorial {
    public static void factorialNumber(int a){
        int x=1;
        for(int i=1;i<=a;i++){ // Using for loop to print 1 to the user input number
            x=x*i;             // Multiply all the number and stored in x container
        }
        System.out.println("Factorial of "+ a + " is: " + x);
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the 'Factorial of a Number' Program");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:- ");
        int a = sc.nextInt();
        factorialNumber(a);
    }
}
