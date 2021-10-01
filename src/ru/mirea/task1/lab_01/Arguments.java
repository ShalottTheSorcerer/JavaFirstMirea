package ru.mirea.task1.lab_01;
import java.util.Scanner;

public class Arguments {
    public static void main(String[] args) {
        System.out.print("Enter the number of arguments ");
        int n = new Scanner(System.in).nextInt();
        int[] arr = new int[n];
        Scanner scn = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            System.out.print("\n");
        }
    }
}
