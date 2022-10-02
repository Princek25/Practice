package com.bridgelabz.basics;
import java.util.Scanner;

// A palindrome number is a number that is same after reverse.
// For example 121, 343, 131, are the palindrome numbers.

public class Palindrome_Number {
    static void palindromeNumber(){
        int num,c,rem,sum =0;    // User Input - num
        System.out.println("Input a number:- ");
        Scanner sc = new Scanner(System.in);
        num=sc.nextInt();     // let num = 121
        c=num;                // c = 121

        while (num>0){        // 121>0 condition true
            rem= num%10;      // rem = 121/10 = 1              // rem = 12/10 = 2     // rem = 1/10 = 1
            sum=(sum*10)+rem; // sum = (0x10)+1 = 1            // sum = (1x10)+2 = 12 // sum = (12x10)+1 = 121
            num=num/10;       // num = 12>0 yes condition true // num = 1 now >0 yes  // num = 0 now condition false
        }
        if (c==sum){  // c = sum = 121
            System.out.println(c + " is a Palindrome Number");
        }
        else System.out.println(c + " is not a Palindrome Number");
    }
    public static void main(String[] args) {
        palindromeNumber();
    }
}
