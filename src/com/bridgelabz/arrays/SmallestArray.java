package com.bridgelabz.arrays;

public class SmallestArray {
    public static void main(String[] args) {
        int arr [] = {37,42,25,35,45,78,21,34};

        int min = arr[0]; //assume

        for (int i=0;i< arr.length;i++){
            if (min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println(min + " is the smallest element in the array");
    }
}
