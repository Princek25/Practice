package com.bridgelabz.basics;
import java.util.Scanner;

public class GreatestOfTwoNumbers {
    static void checkGreatestOfTwoNumber(int a,int b){
        if (a>b){
            System.out.println(a+ " " + "is greatest");
        }
        else System.out.println(b+ " " + "is greatest");
    }
    public static void main(String[] args) {
        System.out.println("Welcome to 'the greatest of two number' program");
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number");
        int a = sc.nextInt();
        System.out.println("Input another number");
        int b = sc.nextInt();
        checkGreatestOfTwoNumber(a,b);
    }
}
