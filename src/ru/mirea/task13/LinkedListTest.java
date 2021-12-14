package ru.mirea.task13;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {
    public LinkedListTest() {
    }

    public static void main(String[] args) {
        LinkedList<String> bar = new LinkedList();
        bar.add("Вино красное");
        bar.addFirst("Вино белое");
        bar.addLast("Ром");
        System.out.printf("В баре напитков: " + bar.size() + "\n");
        Iterator var2 = bar.iterator();

        while(var2.hasNext()) {
            String drink = (String)var2.next();
            System.out.println(drink);
        }

        System.out.printf("\nУдаление первой и последней бутылки\n");
        bar.removeFirst();
        bar.removeLast();
        System.out.printf("В баре осталась одна бутылка:\n");
        System.out.println((String)bar.getFirst());
    }
}
