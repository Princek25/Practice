package com.bridgelabz.basics;
import java.util.Scanner;

public class Greatest_Of_Two_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number");
        int a = sc.nextInt();
        System.out.println("Input another number");
        int b = sc.nextInt();
        if (a>b){
            System.out.println(a+ " " + "is greatest");
        }
        else System.out.println(b+ " " + "is greatest");

    }
}
