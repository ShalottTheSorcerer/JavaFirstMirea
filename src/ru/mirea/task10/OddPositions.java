package ru.mirea.task10;

import java.util.Scanner;

public class OddPositions {
    public static void recursion() {
        int a = new Scanner(System.in).nextInt();
        if (a != 0) {
            System.out.println(a);
            int b = new Scanner(System.in).nextInt();
            if (b != 0) {
                recursion();
            }
        }
    }
    public static void main(String[] args) {
        recursion();
    }
}
