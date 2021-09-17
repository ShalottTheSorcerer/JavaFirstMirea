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

class Breed extends Dog {
    private String breed;

    public Breed(String name, String color, String breed) {
        super(name, color);
        this.breed = breed;
    }

    public void displayInfo() {
        System.out.println(super.getName()+" is a "+super.getColor()+" "+breed);
    }
}
