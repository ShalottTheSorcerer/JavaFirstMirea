package ru.mirea.task10;
import java.math.*;
import java.util.Scanner;

public class MaxNumber {
    public static int recursion() {
        int a = new Scanner(System.in).nextInt();
        if (a == 0) {
            return 0;
        }
        else {
            return Math.max(a, recursion());
        }
    }
    public static void main(String[] args) {
        System.out.println(recursion());
    }
}
