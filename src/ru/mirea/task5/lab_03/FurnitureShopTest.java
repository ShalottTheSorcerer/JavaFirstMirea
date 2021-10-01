package ru.mirea.task5.lab_03;

public class FurnitureShopTest {
    public static void main(String[] args) {
        FurnitureShop b1 = new FurnitureShop("plastic", "red", "chair");
        FurnitureShop b2 = new FurnitureShop("wood", "brown", "table");
        FurnitureShop b3 = new FurnitureShop("steel", "silver", "lantern");
        b1.displayInfo();
        b2.displayInfo();
        b3.displayInfo();
    }
}
