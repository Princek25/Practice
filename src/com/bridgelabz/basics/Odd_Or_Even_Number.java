package com.bridgelabz.basics;
import java.util.Scanner;

// Odd and Even Numbers
// Programing logic = take a user input put in a variable (a) then if a%2=0 then it will be even number

public class Odd_Or_Even_Number {
    static void oddEven(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();      // Taking user input stored in a variable
        if (a%2==0){              // Even no. always gives remainder 0 when is divided by 2.
            System.out.println("It is even number");
        }
        else System.out.println("It is odd number");
    }
    public static void main(String[] args) {
        oddEven();

    }
}
