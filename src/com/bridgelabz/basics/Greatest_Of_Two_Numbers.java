package com.bridgelabz.basics;
import java.util.Scanner;

// Greatest of two numbers
// Programing logic = if a>b then a is greatest otherwise b is greatest

public class Greatest_Of_Two_Numbers {
    static void greatestNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number");
        int a = sc.nextInt();         // Taking user input of first number.
        System.out.println("Input another number");
        int b = sc.nextInt();         // Taking user input of second number.
        if (a>b){
            System.out.println(a+ " " + "is greatest");
        }
        else System.out.println(b+ " " + "is greatest");
    }
    public static void main(String[] args) {
        greatestNumber();
    }
}
