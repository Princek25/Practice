package com.bridgelabz.basics;
import java.util.Scanner;

public class PowerOfANumber {
    public static void powerOfANumber(int n, int p){
        int r=1;  // r= result
        for (int i=1;i<=p;i++){   // i=1;i<=2; true    // i=2; i<=2 true
           r = n*r;               // r = 10x1 = 10    // r = 10x10 = 100
        }
        System.out.println(n + " to the power " + p + " = " + r);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the 'Power of a Number' Program");
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a Number");
        int n=sc.nextInt();
        System.out.println("Input Power of this Number");
        int p=sc.nextInt();
        powerOfANumber(n,p);
    }
}
