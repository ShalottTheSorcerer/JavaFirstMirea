package ru.mirea.task12;
import java.util.ArrayList;

public class SortingStudentsByGPA implements Comparator{
    @Override
    public void quickSort(ArrayList list, int low, int high) {
        if (list.size() == 0) return;
        if (low >= high) return;
        int middle = low + ((high - low) / 2) ;
        int o = (int) list.get(middle);
        int i = low, j = high;
        while (i <=j) {
            while ((int)list.get(i) < o) {
                i++;
            }
            while ((int)list.get(i) > o) {
                j--;
            }
            if (i <= j) {
                int temp = (int)list.get(i);

            }
        }
    }
    public static void out(ArrayList list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
        System.out.print("\n");
    }
    public SortingStudentsByGPA() {};
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        int low = 0;
        int high = list.size() - 1;
        SortingStudentsByGPA one = new SortingStudentsByGPA();
        one.quickSort(list, low, high);
    }
}
