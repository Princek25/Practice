package com.bridgelabz.basics;
import java.util.Scanner;

public class PerfectSquare {
    public static void checkPerfectSquare(int n){
        int sum = 0;            // let n = 9
        for (int i=1;i<n;i++){  // i=1;1<9 true  // when i=3; i<9 true
            if (n/i==i){        // 9/1==9 false  // 9/3==3 true
                sum = sum + i;  //               // sum = 0+3=3
            }
        }
        if (sum*sum==n){  // if sum*sum==n, 3*3==3 true then it is a perfect square
            System.out.println(n + " is a perfect square");
        }
        else System.out.println(n + " is not a perfect square");
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the 'Perfect Square' Program");
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a Number:- ");
        int n = sc.nextInt();
        checkPerfectSquare(n);
    }
}
