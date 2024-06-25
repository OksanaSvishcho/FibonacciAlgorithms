package com.example.fibonacci;

public class RecursiveFibonacci {
    public static int recursiveFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 6;
        int result = recursiveFibonacci(n);
        System.out.println("Recursive Fibonacci of " + n + " is " + result);
    }
}

