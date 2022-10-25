package com.bridgelabz.arrays;

public class LargestAndSmallest {
    public static void main(String[] args) {
        int arr [] = {53,54,24,35,85,45,77};
        int max = arr[0]; // assume
        int min = arr[0]; // assume
        for (int i=0;i< arr.length;i++){
            if (max<arr[i]){
                max=arr[i];
            }
            if (min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println(max + " is largest element of the array");
        System.out.println(min + " is smallest element of the array");
    }
}
