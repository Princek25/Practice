package com.bridgelabz.basics;
import java.util.Scanner;

public class SumOfNumberInRange {
    static void sumOfNumberInRange(int initialN, int finalN){
        int sum=0;
        for (int i=initialN;i<=finalN;i++) {
            sum = sum+i;
        }
        System.out.println("The Sum of Natural Number from " +initialN+ " to " + finalN + " is:- " + sum);
    }
    public static void main(String[] args) {
        System.out.println("Welcome to 'The Sum of Natural Number in Range' Program");
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Initial Number");
        int a = sc.nextInt();
        System.out.println("Input Final Number");
        int b = sc.nextInt();
        sumOfNumberInRange(a,b);
    }
}
