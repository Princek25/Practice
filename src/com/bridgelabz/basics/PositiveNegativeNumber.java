package com.bridgelabz.basics;
import java.util.Scanner;

public class PositiveNegativeNumber {
    static void checkPositiveNegativeNumbers(int a){

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
    public static void main(String[] args) {
        System.out.println("Welcome to Positive Negative Number Program");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int a = sc.nextInt();
        checkPositiveNegativeNumbers(a);
    }
}
