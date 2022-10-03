package com.bridgelabz.basics;

import java.util.Scanner;

public class Perfect_Square {
    static void perfectSquare(){
        int n, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a Number:- ");
        n = sc.nextInt();
        for (int i=1;i<n;i++){
            if (n/i==i){
                sum = sum + i;
            }
        }
        if (sum*sum==n){
            System.out.println(n + " is a perfect square");
        }
        else System.out.println(n + " is not a perfect square");
    }

    public static void main(String[] args) {
        perfectSquare();
    }
}
