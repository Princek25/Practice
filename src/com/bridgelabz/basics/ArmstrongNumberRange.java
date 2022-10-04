package com.bridgelabz.basics;
import java.util.Scanner;

public class ArmstrongNumberRange {
    public static void checkArmstrongNumberRange(int initialN, int finalN){
        for (int i = initialN;i<=finalN;i++){
            boolean b = ArmstrongNumber.checkArmstrongNumber(i);   //class_name.method_name(i)
            if (b){
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the armstrong number in given range program");
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Initial Number:- ");
        int n1 = sc.nextInt();
        System.out.println("Input Final Number:- ");
        int n2 = sc.nextInt();
        checkArmstrongNumberRange(n1,n2);

    }
}
