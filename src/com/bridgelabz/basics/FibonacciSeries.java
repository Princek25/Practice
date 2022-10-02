package com.bridgelabz.basics;
import java.util.Scanner;

// The Fibonacci sequence is a series of numbers where a number is the addition of the last two numbers, starting with 0, and 1
// Eg:- 0 1 1 2 3 5 8 13 for 8 term
// Programing logic = take 4 variable two of them initialized with 0 and 1 third variable adds these two number and fourth variable for number of terms

public class FibonacciSeries {
    public static void fibonacciSeries(){
        int a=0, b=1, c, d;  // a=0 and b=1 for initial value, c=adding two terms, d=no. of terms
        System.out.println("Input a term");   // let the term = 8 input by user
        Scanner sc = new Scanner(System.in);
        d=sc.nextInt();
        for (int i=1;i<=d;i++){          // i=1; i<=8 true  // i=2; i<=8 true  // This Process repeat until i>8
            System.out.print(a + " ");   // print a = 0     // print a = 1
            c=a+b;                       // c = 0+1 = 1     // c = 1+1 = 2
            a=b;                         // a=b=1           // a=b=1
            b=c;                         // b=c=1           // b=c=2
        }
    }
    public static void main(String[] args) {
        fibonacciSeries();
    }
}
