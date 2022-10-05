package com.bridgelabz.basics;
import java.util.Scanner;

public class Factors {
    public static void findFactors(int n){
        for (int i=1;i<=n;i++){
            if (n%i==0){
                System.out.print(i +" ");
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the 'Factors of a Number' Program");
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a Number");
        int n = sc.nextInt();
        findFactors(n);
    }
}
