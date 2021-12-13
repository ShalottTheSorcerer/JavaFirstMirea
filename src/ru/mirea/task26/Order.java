package ru.mirea.task26;

import java.util.LinkedList;

abstract class Order {
    LinkedList<String> items = new LinkedList<String>();
    Strategy strategy;
    public void pay() {
        strategy.pay(items);
    }
}
