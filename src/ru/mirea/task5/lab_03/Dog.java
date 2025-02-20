package ru.mirea.task5.lab_03;

public abstract class Dog {
    private String name;
    private String color;

    public String getName() {
        return name;
    }
    public String getColor() {
        return color;
    }

    public Dog(String name, String color) {
        this.name = name;
        this.color = color;
    }
    public abstract void displayInfo();
}
