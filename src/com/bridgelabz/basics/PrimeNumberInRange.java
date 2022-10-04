package com.bridgelabz.basics;
import java.util.Scanner;

public class PrimeNumberInRange {
    public static void checkPrimeNumberInRange(){
        int a,b,i,j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Initial Number");  // let = 5
        a=sc.nextInt();
        System.out.println("Input Final Number");   // let 25
        b=sc.nextInt();
        for (i=a;i<=b;i++){            // i=5; i<=25 true
            for (j=2;j<i;j++){         //
                if (i%j==0) break;     // j will not break in 5, 7, 11, 13, 17,23 value stored in j. but it will break in 6,8...
            }
            if (i==j){                 // if i=j then print j
                System.out.print(j + " ");
            }
        }
    }
    public static void main(String[] args) {
        checkPrimeNumberInRange();
    }
}
