package ru.mirea.task5.lab_03;

public class DogTest {
    public static void main(String[] args) {
        Breed b1 = new Breed("Jody", "black", "spitz");
        Breed b2 = new Breed("Poppy", "red", "collie");
        Breed b3 = new Breed("Rex", "spotted", "newfoundland");
        b1.displayInfo();
        b2.displayInfo();
        b3.displayInfo();
    }
}
