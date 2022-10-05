package com.bridgelabz.basics;
import java.util.Scanner;

// Greatest number among three numbers
// Programing logic = a>b, a>c and b>a, b>c and c>a, c>a

public class GreatestOfThreeNumbers {
    static void checkGreatestOfThreeNumber(int a, int b, int c){
        if (a>b & a>c){
            System.out.println(a + " " + "is greatest");
        } else if (b>a & b>c) {
            System.out.println(b + " " + "is greatest");
        }
        else System.out.println(c + " " + "is greatest");
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the 'greatest of the three number' program");
        Scanner sc = new Scanner(System.in);
        System.out.println("Input First Number");
        int a = sc.nextInt();      // Taking user input of first number
        System.out.println("Input Second Number");
        int b = sc.nextInt();      // Taking user input of second number
        System.out.println("Input Third Number");
        int c = sc.nextInt();      // Taking user input of third number
        checkGreatestOfThreeNumber(a,b,c);
    }
}
