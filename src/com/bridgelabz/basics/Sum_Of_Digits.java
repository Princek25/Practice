package com.bridgelabz.basics;
import java.util.Scanner;

// Sum of digits:
// Programing logic = let a user input = 123, 123%10 = (3), 123/10 = 12, 12%10 = (2), 12/10 = (1)

public class Sum_Of_Digits {
    static void sumOfDigits(){
        int a,sum = 0;    // Taking two variable a = user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a Number");
        a = sc.nextInt();   // Taking user input stored in variable (a) let a = 123.
        while (a>0){        // 123>0 True            // a = 12>0 True       // a = 1>0 True
            int b = a%10;   // b = 123%10 = 3 = rem  // b = 12%10 = 2 = rem // b = 1%10 = 1
            sum=sum+b;      // sum = 0+3 = 3         // sum = 3+2 = 5       // sum = 5+1 = 6
            a=a/10;         // a = 123/10 = 12       // a = 12/10 = 1       // a = 1/10 = 0
        }
        System.out.println("Sum of digits of the number is:- " + sum);
    }
    public static void main(String[] args) {
        sumOfDigits();
    }
}
