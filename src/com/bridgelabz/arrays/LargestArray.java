package com.bridgelabz.arrays;

public class LargestArray {
    public static void main(String[] args) {
        int arr [] = {12,42,25,35,45,78,21,34};

        int max = arr[0]; //assume  1. max=12

        for (int i=0;i< arr.length;i++){
            if (max<arr[i]){  // 12 <42  // 42<25 //
                max=arr[i];  // max = 42
            }
        }
        System.out.println(max + " is the maximum element in the array");
    }
}
