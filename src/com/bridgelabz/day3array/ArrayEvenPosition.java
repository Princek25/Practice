package com.bridgelabz.day3array;

public class ArrayEvenPosition {
    public static void main(String[] args) {
        int [] a = {10,20,30,40,50,60,70,80};
        System.out.println("printing all the elements in even position");
        for (int i=2;i<a.length;i++){
            if (i%2==0){
                System.out.println("even position elements: " + a[i]);
            }
        }
    }
}
