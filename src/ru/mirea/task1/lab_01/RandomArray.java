package ru.mirea.task1.lab_01;
import java.util.Scanner;

public class RandomArray {
    public static int getRandomNumber() {
        return (int) (Math.random() * 100);
    }
    public static void gnomeSort(int arr[], int n) {
        int index = 0;
        while (index < n) {
            if (index == 0) {
                index++;
            }
            if (arr[index] >= arr[index - 1]) {
                index++;
            } else {
                int temp = 0;
                temp = arr[index];
                arr[index] = arr[index - 1];
                arr[index - 1] = temp;
                index--;
            }
        }
        return;
    }
    public static void main(String[] args) {
        int n = getRandomNumber();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = getRandomNumber();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
        gnomeSort(arr, arr.length);
        System.out.print("\n");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
    }
}