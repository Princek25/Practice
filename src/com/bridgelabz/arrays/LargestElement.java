package com.bridgelabz.arrays;

public class LargestElement {

    void checkLargestElement(int arr []){
        int largest = arr[0];
        for (int i=0;i<arr.length;i++){
            if (largest<arr[i]){
                largest=arr[i];
            }
        }
        System.out.println(largest + " is the largest element in the array");
    }

    public static void main(String[] args) {
        int arr [] = {12,42,25,35,45,78,21,34};
        LargestElement obj = new LargestElement();
        obj.checkLargestElement(arr);
    }
}
