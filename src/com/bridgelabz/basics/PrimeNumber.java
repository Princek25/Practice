package com.bridgelabz.basics;
import java.util.Scanner;

// Prime Number Logic = When a number is divided by 1 or itself it gives the remainder 0
// Eg:- 7 = 7%1=0 and 7%7=0 both the remainder is 0.

public class PrimeNumber {
    static void primeNumber(){
        int c=0; // division count  // Declared + Initialized a variable
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a Number");
        int a = sc.nextInt();     // a = user input = 7(let)
        for (int i=1;i<=a;i++){   // i =1, i<=7 true   // i = 2, i<=7 true                 // i =7, i<=7 true
            if (a%i==0) {         // 7%1 = 0 true      // 7%2 = 0 false repeat until i =6  // 7%7 = 0 true
                c++;              // c++ = 0+1 = 1                                         // c++ = 1+1 = 2
            }
        }
        if (c==2){   // when the value of c is 2 then it will be a prime number
            System.out.println(a + " is a Prime Number");
        }
        else System.out.println(a + " is not a Prime Number");

    }
    public static void main(String[] args) {
        primeNumber();
    }
}
