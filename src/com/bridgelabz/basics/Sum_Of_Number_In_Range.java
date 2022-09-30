package com.bridgelabz.basics;
import java.util.Scanner;

public class Sum_Of_Number_In_Range {
    public static void main(String[] args) {
        int i,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a Range Starts from");
        int a = sc.nextInt();
        System.out.println("Input a Range Ends With");
        int b = sc.nextInt();
        for (i=a;i<=b;i++){
            sum+=i;
        }
        System.out.println("The sum of natural number from " + a + " to " + b + " is:- " + sum);

    }
}
