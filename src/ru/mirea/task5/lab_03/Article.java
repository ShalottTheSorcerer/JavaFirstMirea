package ru.mirea.task5.lab_03;

class Article extends Furniture{
    private String type;

    public Article(String material, String color, String type) {
        super(material, color);
        this.type = type;
    }

    public void displayInfo() {
        System.out.println("The "+type+" is "+super.getColor()+" and made from "+super.getMaterial());
    }
}
