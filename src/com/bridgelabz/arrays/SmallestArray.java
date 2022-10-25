package com.bridgelabz.arrays;

public class SmallestArray {

    void checkSmallestArray(int arr[]){
        int smallest = arr[0]; // assume
        for (int i = 0;i<arr.length;i++){
            if (smallest>arr[i]){
                smallest=arr[i];
            }
        }
        System.out.println(smallest + " is the smallest element in the array");
    }

    public static void main(String[] args) {
        int arr [] = {37,42,25,35,45,78,21,34};
        SmallestArray obj = new SmallestArray();
        obj.checkSmallestArray(arr);
    }
}
