package ru.mirea.task6;

public class Planet implements Nameable {
    private String name;
    private int number;

    public Planet(String name, int number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public void getName() {
        System.out.println("The name of the planet №"+number+" is "+name);
    }
}
