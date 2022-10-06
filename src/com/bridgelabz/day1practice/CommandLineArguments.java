package com.bridgelabz.day1practice;

// 1.4 To find the sum of command-line arguments and count the invalid integers entered.

public class CommandLineArguments {

    public static void main(String[] args) {
        int a = Integer.parseInt(args [0]);
        int b = Integer.parseInt(args[1]);
        int c = a + b;
        System.out.println("Addition of "+ a + " and " + b + " is:- " + c);

    }
}
