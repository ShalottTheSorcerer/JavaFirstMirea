package ru.mirea.task1.lab_01;
import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        System.out.print("Enter the length of the array ");
        int n = new Scanner(System.in).nextInt();
        Scanner scn = new Scanner(System.in);
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        for (int i = 0; i < n; i++) {
            sum = arr[i] + sum;
        }
        System.out.print(sum);
    }
}