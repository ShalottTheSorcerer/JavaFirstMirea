package ru.mirea.task5.lab_03;

public class DishTest {
    public static void main(String[] args) {
        Type b1 = new Type("clay", "brown", "cup");
        Type b2 = new Type("porcelain", "white", "vase");
        Type b3 = new Type("plastic", "blue", "teapot");
        b1.displayInfo();
        b2.displayInfo();
        b3.displayInfo();
    }
}
