package com.butzevka;

public class FibonacciMain {

    public static void main(String[] args) {
        System.out.println(fibonacci(8));
        for (int i = 0; i <= 8; i++) {
            System.out.print(fibonacci(i)+" ");
        }
    }

    public static int fibonacci(int n) {
        return (n < 2) ? n : fibonacci(n - 1) + fibonacci(n - 2);
    }

}
