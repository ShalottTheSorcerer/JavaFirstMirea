package ru.mirea.task5.lab_03;

public abstract class Dish {
    private String material;
    private String color;

    public String getMaterial() {
        return material;
    }
    public String getColor() {
        return color;
    }

    public Dish(String material, String color) {
        this.material = material;
        this.color = color;
    }
    public abstract void displayInfo();
}
