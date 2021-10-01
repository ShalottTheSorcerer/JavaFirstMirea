package ru.mirea.task6;

public class Cat implements Nameable {
    private String name;
    private String breed;
    private int age;

    public Cat(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    @Override
    public void getName() {
        System.out.println("This "+breed+" "+age+" year old cat's name is "+name);
    }
}
