package ru.mirea.task13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {
    public ArrayListTest() {
    }

    public static void output(ArrayList<String> bar) {
        System.out.printf("В баре напитков: " + bar.size() + "\n");
        Iterator var1 = bar.iterator();

        while(var1.hasNext()) {
            String drink = (String)var1.next();
            System.out.println(drink);
        }

        System.out.printf("\n");
    }

    public static void findIndex(ArrayList<String> bar, int index) {
        System.out.printf("Напиток под номером " + index + ":\n");
        System.out.println((String)bar.get(index));
        System.out.printf("\n");
    }

    public static void remove(ArrayList<String> bar, int index) {
        System.out.printf("Напиток под номером " + index + " удален: \n");
        System.out.println((String)bar.remove(index));
        System.out.printf("\n");
    }

    public static void findFirstObj(ArrayList<String> bar, String obj) {
        System.out.printf("Первая бутылка напитка \"" + obj + "\" под номером:\n");
        System.out.println(bar.indexOf(obj));
        System.out.printf("\n");
    }

    public static void findLastObj(ArrayList<String> bar, String obj) {
        System.out.printf("Последняя бутылка напитка \"" + obj + "\" под номером:\n");
        System.out.println(bar.lastIndexOf(obj));
        System.out.printf("\n");
    }

    public static void set(ArrayList<String> bar, int index, String obj) {
        System.out.printf("Под номером " + index + " теперь напиток \"" + obj + "\"\n");
        bar.set(index, obj);
        System.out.printf("\n");
    }

    public static void add(ArrayList<String> bar, ArrayList<String> newBar) {
        System.out.printf("В бар добавлены новые напитки.\n");
        bar.addAll(bar.size(), newBar);
        output(bar);
        System.out.printf("\n");
    }

    public static void positions(ArrayList<String> bar, int start, int end) {
        System.out.printf("Напитки в бутылках с номера " + start + " по номер " + end + ": \n");
        new ArrayList();
        List<String> partBar = bar.subList(start, end + 1);
        Iterator var4 = partBar.iterator();

        while(var4.hasNext()) {
            String drink = (String)var4.next();
            System.out.println(drink);
        }

        System.out.printf("\n");
    }

    public static void main(String[] args) {
        ArrayList<String> bar = new ArrayList();
        bar.add("Вино красное");
        bar.add("Вино белое");
        bar.add("Ром");
        bar.add("Херес");
        bar.add("Виски");
        bar.add("Ром");
        output(bar);
        findIndex(bar, 0);
        findFirstObj(bar, "Ром");
        findLastObj(bar, "Ром");
        remove(bar, 0);
        set(bar, 0, "Кьянти");
        ArrayList<String> newBar = new ArrayList();
        newBar.add("Вино красное");
        newBar.add("Бренди");
        newBar.add("Водка");
        add(bar, newBar);
        positions(bar, 3, 6);
    }
}
