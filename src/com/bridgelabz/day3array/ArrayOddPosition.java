package com.bridgelabz.day3array;

public class ArrayOddPosition {
    public static void main(String[] args) {
        int [] a = {10,20,30,40,50,60,70};
        System.out.println("printing all the elements in odd position");
        for (int i=1;i< a.length;i++){
            if (i%2!=0){
                System.out.println("elements in odd position: " + a[i]);
            }
        }
    }
}
