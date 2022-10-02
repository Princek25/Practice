package com.bridgelabz.basics;
import java.util.Scanner;

// Armstrong number is the sum of the cubes of the digits of any number which is equal to the number itself.
// Eg:- 153 = 1x1x1 + 5x5x5 + 3x3x3 = 1 + 125 + 27 = 153
// Programing Logic = let user input = 153, print all the digit individually and multiply by 3 times then add

public class Armstrong_Number {
    static void armstrongNumber(){
        int a,b,sum=0;
        int i = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number");
        a = sc.nextInt();         // a = user input
        i = a;                    // giving a value to i
        while (a>0){              // a = 153(let), 153>0 yes condition true // a = 15>0 Yes true         // a = 1>0 Yes true
            b = a%10;             // b = 153%10 = 3 = remainder             // b = 15%10 = 5             // b = 1%10 = 1
            a = a/10;             // a = 153/10 = 15 now                    // a = 15/10 = 1             // a = 1/10 = 0
            sum = sum + (b*b*b);  // sum = 0 + (3x3x3) = 27                 // sum = 27 +(5x5x5) = 152   // sum = 152 = (1x1x1) = 153
        }
        if (sum==i){      // if sum = 153 equal to i=a=153 then it will be armstrong number
            System.out.println(i + " is an Armstrong Number");
        }
        else System.out.println(i + " is not an Armstrong Number");
    }
    public static void main(String[] args) {
        armstrongNumber();
    }
}
// Output = 153,370,371,407 are armstrong number
// Output =  123,145,124 these are not a armstrong number