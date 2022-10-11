package com.bridgelabz.day3array;

public class ArrayAscending {
    public static void main(String[] args) {
        int [] a = {12,45,65,23,15,48,36};
        int temp;
        System.out.println("printing array in ascending order");
        for (int i=0;i< a.length;i++){
            for (int j=i+1;j<a.length;j++){
                if (a[i]>a[j]){
                    temp=a[i]; // swapping
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for (int i=0;i< a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
}
