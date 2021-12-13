package ru.mirea.task26;

public class CreditCardOrder extends Order{
    CreditCardOrder() {
        this.strategy = new CreditCart();
    }
}
