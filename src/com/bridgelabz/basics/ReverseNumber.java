package com.bridgelabz.basics;
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        int a,b;     // Declaring a and b variable of integer type.
        int c=0;    // Declaring another variable c initializing with 0.
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number");
        a=sc.nextInt();
        while (a>0){      // condition of while loop
            b = a%10;     // b container store the value of remainder by dividing user input number by 10.
            a = a/10;     // a store the quotient value of a/10.
            c = (c*10)+b; // C = 0*10 + 6 = 6 again C = 10*6 + 4 = 64
        }
        System.out.println("Reverse of the number is:- " + c);
    }
}
