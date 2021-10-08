package ru.mirea.task12;

public class Student {

    public Student() {
    }

    public static void out(int[] iDNumber) {
        for (int i = 0; i < iDNumber.length; i++) {
            System.out.print(iDNumber[i]+" ");
        }
        System.out.print("\n");
    }
    public void sort(int[] iDNumber) {
        Student.out(iDNumber);
        for (int i = 0; i < iDNumber.length; i++) {
            int value = iDNumber[i];
            int j = i - 1;
            for (; j>= 0; j--) {
                if (value < iDNumber[j]) {
                    iDNumber[j + 1] = iDNumber[j];
                } else {
                    break;
                }
            }
            iDNumber[j + 1] = value;
        }
        Student.out(iDNumber);
    }

}
