package com.bridgelabz.basics;
import java.util.Scanner;

public class EvenOddNumber {
    static void checkEvenOddNumber(int a){
        if (a%2==0){
            System.out.println(a + " is Even Number");
        }
        else System.out.println(a + " is Odd Number");
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Even Odd Number Program");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int a = sc.nextInt();
        checkEvenOddNumber(a);

    }
}
