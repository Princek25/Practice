package com.bridgelabz.basics;
import java.util.Scanner;

// Input = 123 Output = 321

public class ReverseNumber {
    static void reverseNumber(){
        int a,b;     // Declaring (a = user input and b = remainder) variables of integer type.
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number");
        a=sc.nextInt();
        System.out.println("The reverse of "+ a + " is:- ");
        while (a>0){      // a = user input lets = 123, a>0 yes condition true // a = 12 > 0 condition true
            b = a%10;     // b = 123%10 = 3 = remainder and print 3.           // b = 12%10 = 2 = remainder and print 2.
            a = a/10;     // a = 12 now because 3 remove. // now again a>0    //  a = 1 this time repeat one more time
            System.out.print(b);
        }
    }
    public static void main(String[] args) {
        reverseNumber();
    }
}
