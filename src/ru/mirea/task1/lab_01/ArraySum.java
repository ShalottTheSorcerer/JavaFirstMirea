package ru.mirea.task1.lab_01;
import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] arr = new int[10];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            sum = arr[i] + sum;
        }
        System.out.print(sum);
    }
}