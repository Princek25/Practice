package com.bridgelabz.basics;
import java.util.Scanner;   // importing a scanner class

public class Positive_Or_Negative_Number {
    public static void main(String[] args) {
        System.out.println("Enter a number ");  // Taking input from the user
        Scanner sc = new Scanner(System.in);   // creating an object of scanner class (sc)
        int a = sc.nextInt();                 // creating a variable (a) of int type and calling the object sc
        if (a>=1){
            System.out.println("It is a positive number");
        }
        else if (a==0) {
            System.out.println("It is neither positive nor negative number");
        }
        else {
            System.out.println("It is a negative number");
        }
    }
}
