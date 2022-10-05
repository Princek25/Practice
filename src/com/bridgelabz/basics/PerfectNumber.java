package com.bridgelabz.basics;

// Perfect Number = A number that is equal to the sum of its proper divisor
// Eg:- 6 = 1+2+3 = 6

import java.util.Scanner;

public class PerfectNumber {
    public static void checkPerfectNumber(int n){
        int sum=0;             // let user input = 6 = n
        for (int i=1;i<n;i++){ // i=1; i<6 true
            if (n%i==0){       // 6%1==0 true
                sum = sum + i; // sum = 0+1 =1  // The whole process repeat, sum become = 1 + 2 + 3 = 6
            }
        }
        if (n==sum){   // if 6 = 6 then print perfect number if not then not a perfect number
            System.out.println("It is a Perfect Number");
        }
        else System.out.println("It is not a Perfect Number");
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the 'Perfect Number' Program");
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number");
        int n= sc.nextInt();
        checkPerfectNumber(n);
    }
}
