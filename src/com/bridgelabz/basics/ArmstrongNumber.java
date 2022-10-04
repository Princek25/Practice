package com.bridgelabz.basics;
import java.util.Scanner;

public class ArmstrongNumber {
    public static boolean checkArmstrongNumber(int n){
        int a = 0;
        int i = n;
        while (n>0){
            int r = n%10;
            a = (r*r*r)+a;
            n = n/10;
        }
        if (i==a){
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the armstrong number in given range program ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number:- ");
        int n =sc.nextInt();
        boolean b = checkArmstrongNumber(n);
        if (b){
            System.out.println(n + " is an Armstrong Number");
        }
        else {
            System.out.println(n + " is not an Armstrong Number");
        }
    }
}
