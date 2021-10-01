package ru.mirea.task5.lab_03;

public class FurnitureTest {
    public static void main(String[] args) {
        Article b1 = new Article("plastic", "red", "chair");
        Article b2 = new Article("wood", "brown", "table");
        Article b3 = new Article("steel", "silver", "lantern");
        b1.displayInfo();
        b2.displayInfo();
        b3.displayInfo();
    }
}
