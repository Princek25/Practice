package com.bridgelabz.day3array;

public class ArrayMin {
    public static void main(String[] args) {
        int [] a = {80,20,30,50,10,90,60};
        int min=a[0];  // assume
        for (int i=1;i<a.length;i++){
            if (a[i]<min){
                min=a[i];
            }
        }
        System.out.println("Minimum values of the element: " + min);
    }
}
