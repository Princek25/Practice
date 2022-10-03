package com.bridgelabz.basics;

import java.util.Scanner;

public class Power_Of_A_Number {
    static void powerOfANumber(){
        int n,p,r=1;              // Taking variables n = user input, p = power , r = result =1 because of multiplication.
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number");
        n=sc.nextInt();           // Taking user input n let 10
        System.out.println("Input power of the number");
        p=sc.nextInt();           // Taking user input power of n = p let 2
        for (int i=1;i<=p;i++){   // i=1;i<=2; true    // i=2; i<=2 true
           r = n*r;               // r = 10x1 = 10    // r = 10x10 = 100
        }
        System.out.println(n + " to the power " + p + " = " + r);
    }

    public static void main(String[] args) {
        powerOfANumber();
    }
}
