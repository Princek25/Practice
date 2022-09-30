package com.bridgelabz.basics;
import java.util.Scanner;     // importing a scanner class

public class Greatest_Of_Two_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // creating an object of scanner class (sc)
        System.out.println("Input a number");  // Taking input from the user
        int a = sc.nextInt();                 // creating a variable (a) of int type and calling the object sc
        System.out.println("Input another number");
        int b = sc.nextInt();
        if (a>b){
            System.out.println(a+ " " + "is greatest");
        }
        else System.out.println(b+ " " + "is greatest");

    }
}
