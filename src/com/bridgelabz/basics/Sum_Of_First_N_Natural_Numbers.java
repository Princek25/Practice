package com.bridgelabz.basics;
import java.util.Scanner;          // importing a scanner class

public class Sum_Of_First_N_Natural_Numbers {
    public static void main(String[] args) {
        int i,n,sum=0;                         // Taking variable i,n and sum of int type
        Scanner sc = new Scanner(System.in);   // creating an object of scanner class (sc)
        System.out.println("Input a number");  // Taking input from the user
        n = sc.nextInt();                      // calling the object through variable n

        for (i=1;i<=n;i++) {
            sum += i;
        }
        System.out.println("The Sum of Natural Number up to " +n+ " terms are :- " + sum);
    }
}
