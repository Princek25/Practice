package com.bridgelabz.basics;
import java.util.Scanner;

public class Sum_Of_First_N_Natural_Numbers {
    public static void main(String[] args) {
        int i,n,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number");
        n = sc.nextInt();

        for (i=1;i<=n;i++) {
            sum += i;
        }
        System.out.println("The Sum of Natural Number up to " +n+ " terms are :- " + sum);
    }
}
