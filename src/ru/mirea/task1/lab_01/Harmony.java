package ru.mirea.task1.lab_01;

public class Harmony {
    public static void main(String[] args) {
        double[] arr = new double[10];
        for (int i = 1; i < 11; i++) {
            arr[i - 1] = 1.0 * 1 / i;
        }
        for (int i = 1; i < 11; i++) {
            String str = String.format("%.2f", arr[i-1]);
            System.out.print(str);
            System.out.print("\n");
        }
    }
}