package ru.mirea.task6;

public class Fruit implements Priceable{
    private String type;
    private int cost;

    public Fruit(String type, int cost) {
        this.type = type;
        this.cost = cost;
    }

    @Override
    public void getPrice() {
        System.out.println("The cost of one "+type+" is "+cost+"$");
    }
}
