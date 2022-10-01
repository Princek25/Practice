package com.bridgelabz.basics;
import java.util.Scanner;

// Armstrong number is the sum of the cubes of the digits of any number
// which is equal to the number itself

public class Armstrong_Number {
    public static void main(String[] args) {
        int num;
        int temp;
        int sum;
        int i = 1;
        int n = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number");
        num = sc.nextInt();
        sum = 0;
        i = num;
        while (num>0){
            n = num % 10;
            num = num /10;
            sum = sum + (n*n*n);
        }
        if (sum==i){
            System.out.println(i + " is an Armstrong Number");
        }
        else System.out.println(i + " is not an Armstrong Number");
    }
}
// Output = 153,370,371,407 are armstrong number
// Output =  123,145,124 these are not a armstrong number