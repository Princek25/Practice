package com.bridgelabz.day3array;

public class ArrayMax {
    public static void main(String[] args) {
        int [] a = {10,20,30,50,40,90,60};
        int max=a[0];  // assume
        for (int i=1;i<a.length;i++){
            if (a[i]>max){
                max=a[i];
            }
        }
        System.out.println("Maximum values of the element: " + max);
    }
}
