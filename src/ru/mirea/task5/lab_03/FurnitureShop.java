package ru.mirea.task5.lab_03;

class FurnitureShop extends Article {
    private String item;

    public FurnitureShop(String material, String color, String type) {
        super(material, color, type);
        this.item = color+" "+material+" "+type;
    }
    public void displayInfo() {
        System.out.println("The "+item+" is in the shop");
    }
}
