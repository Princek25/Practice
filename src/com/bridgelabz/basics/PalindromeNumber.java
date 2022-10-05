package com.bridgelabz.basics;
import java.util.Scanner;

// A palindrome number is a number that is same after reverse.
// For example 121, 343, 131, are the palindrome numbers.

public class PalindromeNumber {
    public static void checkPalindromeNumber(int a){
        int b,c,sum =0;
        c=a;                // let user input = 121
        while (a>0){        // 121>0 condition true
            b= a%10;        // b = 121/10 = 1      // b = 12/10 = 2       // b = 1/10 = 1
            sum=(sum*10)+b; // sum = (0x10)+1 = 1  // sum = (1x10)+2 = 12 // sum = (12x10)+1 = 121
            a=a/10;         // a = 121/10 = 12     // a = 12/10           // a = 0 now condition false
        }
        if (c==sum){  // c = sum = 121
            System.out.println(c + " is a Palindrome Number");
        }
        else System.out.println(c + " is not a Palindrome Number");
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the 'Palindrome Number' Program");
        System.out.println("Input a number:- ");
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        checkPalindromeNumber(a);
    }
}
