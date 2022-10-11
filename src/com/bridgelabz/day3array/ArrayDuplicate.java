package com.bridgelabz.day3array;

public class ArrayDuplicate {
    public static void main(String[] args) {
        int [] a = {10,50,40,20,50,30,40,50,60};
        System.out.println("printing duplicate elements of an array");
        for (int i=0;i<a.length;i++){
            for (int j=i+1;j<a.length;j++){
                if (a[j]==a[i]){
                    System.out.println("duplicate elements: " + a[j]);
                }
            }
        }
    }
}
