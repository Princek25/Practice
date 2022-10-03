package com.bridgelabz.basics;

import java.util.Scanner;

public class Prime_Factors {
    static void primeFactors(){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number:- ");
        n=sc.nextInt();
        for (int i =1;i<=n;i++){
            if (n%i==0){
                System.out.print(i + " ");
            }
        }

    }
    public static void main(String[] args) {
        primeFactors();
    }
}
