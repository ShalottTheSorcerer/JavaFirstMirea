package ru.mirea.task26;

import java.util.LinkedList;

public class CreditCart implements Strategy{
    @Override
    public void pay(LinkedList<String> items) {
        System.out.println("You have chosen a credit card for your order");
        System.out.println("Your order contains:");
        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i));
        }
    }
}
