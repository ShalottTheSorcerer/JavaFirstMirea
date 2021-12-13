package ru.mirea.task26;

public class PaypalOrder extends Order{
    PaypalOrder() {
        this.strategy = new Paypal();
    }
}
