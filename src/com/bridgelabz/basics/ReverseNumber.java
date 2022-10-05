package com.bridgelabz.basics;
import java.util.Scanner;

public class ReverseNumber {
    public static void reverseNumber(int a){
        while (a>0){         // let user input = 123 // a = 12 > 0 true  // a = 1 > 0 true
           int b = a%10;     // b = 123%10 = 3       // b = 12%10 = 2    // b = 2/10 = 0
            a = a/10;        // a = 12/10 = 12       // a = 12/10 = 1    // a = 1/10 = 0
            System.out.print(b);
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the 'Reverse of a Number' Program");
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number");
        int a=sc.nextInt();
        System.out.println("The reverse of "+ a + " is:- ");
        reverseNumber(a);
    }
}
