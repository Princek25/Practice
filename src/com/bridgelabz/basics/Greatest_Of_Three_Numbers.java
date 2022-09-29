package com.bridgelabz.basics;
import java.util.Scanner;

public class Greatest_Of_Three_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input First Number");
        int a = sc.nextInt();
        System.out.println("Input Second Number");
        int b = sc.nextInt();
        System.out.println("Input Third Number");
        int c = sc.nextInt();
        if (a>b & a>c){
            System.out.println(a + " " + "is greatest");
        } else if (b>a & b>c) {
            System.out.println(b + " " + "is greatest");
        }
        else System.out.println(c + " " + "is greatest");
    }
}
