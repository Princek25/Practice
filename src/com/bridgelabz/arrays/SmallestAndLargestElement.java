package com.bridgelabz.arrays;

public class SmallestAndLargestElement {

    void checkSmallestAndLargestElement(int arr []){
        int largest = arr[0], smallest = arr[0];
        for (int i = 0; i<arr.length;i++){
            if (largest<arr[i]){
                largest=arr[i];
            }
            if (smallest>arr[i]){
                smallest=arr[i];
            }
        }
        System.out.println(smallest + " is the smallest element in the array");
        System.out.println(largest + " is the largest element in the array");
    }

    public static void main(String[] args) {
        int arr [] = {26, 53, 54, 24, 35, 85, 45, 77};
        SmallestAndLargestElement obj = new SmallestAndLargestElement();
        obj.checkSmallestAndLargestElement(arr);
    }
}
