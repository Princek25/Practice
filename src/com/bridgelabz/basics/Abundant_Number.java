package com.bridgelabz.basics;
import java.util.Scanner;

// Abundant Number = The sum of all the divisors of a number is greater than the number itself.
// Eg:- 12, divisors of 12 is 1+2+3+4+6 = 16 which is greater than 12.
// Programing logic = take all the divisors of a number and apply a condition, which greater than the number.

public class Abundant_Number {
    static void abundantNumber(){
        int n,sum=0;                         // Taking two variable n(user input) and sum=0.
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number:- ");
        n = sc.nextInt();                  // Taking user input lets n = 12
        for (int i=1;i<n;i++) {            // i=1;i<12 true      // i=2; i<12 true
            if (n % i == 0) {              // 12%1=0 true        // 12%2=0 true
                sum = sum + i;             // sum = 0+1 = 1      // sum = 1+2 = 3
            }                     // sum = 0+1=1, 1+2=3, ... so on
        }
        if (sum>n){               // sum is greater than 12 then it is an armstrong number
            System.out.println( n + " is an Abundant Number");
        }
        else System.out.println(n + " is not an Abundant Number");
    }
    public static void main(String[] args) {
        abundantNumber();
    }
}
