package ru.mirea.task5.lab_03;

class Type extends Dish {
    private String type;

    public Type(String material, String color, String type) {
        super(material, color);
        this.type = type;
    }

    public void displayInfo() {
        System.out.println("The "+type+" is "+super.getColor()+" and made from "+super.getMaterial());
    }
}
