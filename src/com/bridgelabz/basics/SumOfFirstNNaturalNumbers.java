package com.bridgelabz.basics;
import java.util.Scanner;

public class SumOfFirstNNaturalNumbers {
    static void sumOfFirstNNaturalNumbers(int a){
        int sum=0;
        for (int i=1;i<=a;i++) {
            sum = sum+i;
        }
        System.out.println("The Sum of Natural Number up to " +a+ " terms are :- " + sum);
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the 'Sum of the First N Natural Numbers' Program");
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number");
        int n = sc.nextInt();
        sumOfFirstNNaturalNumbers(n);

    }
}
