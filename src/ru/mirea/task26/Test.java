package ru.mirea.task26;

import java.util.LinkedList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> items = new LinkedList<String>();
        items.add("War and peace");
        items.add("The catcher in the rye");
        items.add("Crime and punishment");
        items.add("Pride and prejudice");
        System.out.println("Do you want to pay by the credit card or by Paypal? (0 - credit card, 1 - Paypal)");
        if (sc.nextInt() == 0) {
            Order order = new CreditCardOrder();
            order.items = items;
            order.pay();
        } else {
            Order order = new PaypalOrder();
            order.items = items;
            order.pay();
        }
    }
}
