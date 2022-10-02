package com.bridgelabz.basics;
import java.util.Scanner;

// Sum of first N natural numbers
// Programing logic = take a user input and print all the number from 1 to the user input then add all

public class Sum_Of_First_N_Natural_Numbers {
    static void sumOfFirstNNaturalNumbers(){
        int i,n,sum=0;                         // Taking variable i,n and sum of int type
        Scanner sc = new Scanner(System.in);   // Creating an object of scanner class (sc)
        System.out.println("Input a number");  // Taking input from the user
        n = sc.nextInt();                      // Calling the object through variable n

        for (i=1;i<=n;i++) {        // Print 1 to the user input
            sum += i;               // Add all and store in sum
        }
        System.out.println("The Sum of Natural Number up to " +n+ " terms are :- " + sum);
    }
    public static void main(String[] args) {
        sumOfFirstNNaturalNumbers();

    }
}
