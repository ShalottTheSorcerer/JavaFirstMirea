package ru.mirea.task5.lab_03;

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