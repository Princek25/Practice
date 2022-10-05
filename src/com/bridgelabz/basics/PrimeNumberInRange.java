package com.bridgelabz.basics;
import java.util.Scanner;

public class PrimeNumberInRange {
    public static void checkPrimeNumberInRange(int initialN, int finalN){
        for (int i=initialN;i<=finalN;i++){
            boolean isPrime = PrimeNumber.checkPrimeNumber(i);
            if (isPrime)
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the 'Prime number within a given range' Program");
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Initial Number");
        int a=sc.nextInt();
        System.out.println("Input Final Number");
        int b=sc.nextInt();
        checkPrimeNumberInRange(a,b);
    }
}
