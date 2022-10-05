package com.bridgelabz.basics;
import java.util.Scanner;

// The Fibonacci sequence is a series of numbers where a number is the addition of the last two numbers, starting with 0, and 1
// Eg:- 0 1 1 2 3 5 8 13 for 8 term


public class FibonacciSeries {
    public static void fibonacciSeries(int n){
        int a=0, b=1, sum;               // a=0 and b=1 for initial value. let user input = 8
        for (int i=1;i<=n;i++){          // i=1; i<=8 true  // i=2; i<=8 true  // This Process repeats until i>8
            System.out.print(a + " ");   // print a = 0     // print a = 1
            sum=a+b;                     // sum = 0+1 = 1   // sum = 1+1 = 2
            a=b;                         // a=b=1           // a=b=1
            b=sum;                       // b=sum=1         // b=sum=2
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the 'Fibonacci Series' Program");
        System.out.println("Input a Nth Term");
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        fibonacciSeries(a);
    }
}
