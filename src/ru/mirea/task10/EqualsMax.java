package ru.mirea.task10;

import java.util.Scanner;

public class EqualsMax {
    public static void recursion(int max, int count) {
        int a = new Scanner(System.in).nextInt();
        if (a == 0) {
            System.out.print(count);
        } else if (a > max) {
            recursion(a, 1);
        } else if (a == max) {
            recursion(max, (count + 1));
        } else {
            recursion(max, count);
        }
    }
    public static void main(String[] args) {
        recursion(0, 0);
    }
}
