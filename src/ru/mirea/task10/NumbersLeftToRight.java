package ru.mirea.task10;

import java.util.Scanner;

public class NumbersLeftToRight {
    public static  int recursion(int a) {
        if (a == 0) {
            return 0;
        }
        else {
            recursion((a / 10));
            System.out.print(a % 10);
            System.out.print(" ");
            return  0;
        }
    }
    public static void main(String[] args) {
        int a = new Scanner(System.in).nextInt();
        if (a == 0) {
            System.out.print(0);
        } else {
            recursion(a);
        }
    }
}
