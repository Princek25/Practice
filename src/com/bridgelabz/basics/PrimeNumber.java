package com.bridgelabz.basics;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int c=0; // division count  // Declared + Initialized a variable
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a Number");
        int a = sc.nextInt();
        for (int i=1;i<=a;i++){
            if (a%i==0) {
                c++;  // Increment
            }
        }
        if (c==2){
            System.out.println(a + " is a Prime Number");
        }
        else System.out.println(a + " is not a Prime Number");
    }
}
