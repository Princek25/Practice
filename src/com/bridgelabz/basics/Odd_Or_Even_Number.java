package com.bridgelabz.basics;
import java.util.Scanner;     // importing a scanner class

public class Odd_Or_Even_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);     // Creating an object of scanner class (sc)
        System.out.println("Enter a number");   // Taking input from the user
        int a = sc.nextInt();                  // Creating a variable (a) of int type and calling the object sc
        if (a%2==0){                          // If any number divided by 2 with 0 remainder then it will be even no. otherwise it will be odd no.
            System.out.println("It is even number");
        }
        else System.out.println("It is odd number");

    }
}
