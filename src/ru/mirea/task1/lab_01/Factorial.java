package ru.mirea.task1.lab_01;

import java.util.Scanner;

public class Factorial {
    public static int getFactorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        System.out.print(getFactorial(n));
    }
}
