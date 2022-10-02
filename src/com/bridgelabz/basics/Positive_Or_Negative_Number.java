package com.bridgelabz.basics;
import java.util.Scanner;

// Positive or Negative Numbers
// Programing Logic = if a number is greater than 1 is positive else negative and 0 = neither positive nor negative

public class Positive_Or_Negative_Number {
    static void positiveNegativeNumbers(){
        System.out.println("Enter a number ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();      // Taking user input stored in variable (a).
        if (a>=1){
            System.out.println("It is a positive number");
        }
        else if (a==0) {
            System.out.println("It is neither positive nor negative number");
        }
        else {
            System.out.println("It is a negative number");
        }
    }
    public static void main(String[] args) {
        positiveNegativeNumbers();
    }
}
