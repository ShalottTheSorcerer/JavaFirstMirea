package ru.mirea.task6;

public class PriceableTest {
    public static void main(String[] args) {
        Fruit s1 = new Fruit("Mango", 10);
        Fruit s2 = new Fruit("Apple",  2);
        Market s3 = new Market("silver spoon",10);
        Market s4 = new Market("dinosaur's egg",1000000);
        s1.getPrice();
        s2.getPrice();
        s3.getPrice();
        s4.getPrice();
    }
}
