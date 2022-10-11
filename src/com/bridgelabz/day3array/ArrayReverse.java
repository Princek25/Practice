package com.bridgelabz.day3array;

public class ArrayReverse {
    public static void main(String[] args) {
        int [] a = {10,20,30,40,50,60,70};
        System.out.println("printing array in reverse order");
        for (int i= a.length-1;i>=0;i--){  // a.length=7 we need 6
            System.out.print(a[i] + " ");
        }
    }
}
