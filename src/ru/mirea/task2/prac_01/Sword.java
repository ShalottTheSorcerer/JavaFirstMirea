package ru.mirea.task2.prac_01;

public class Sword {
    private String length;
    private String type;
    private String name;

    public Sword(String l, String t, String n) {
        length = l;
        type = t;
        name = n;
    }
    public Sword() {
        length = "long";
        type = "saber";
        name = "scimitar";
    }
    public Sword(String n) {
        length = "long";
        type = "two-handed";
        name = n;
    }
    public void setLength(String length) {
        this.length = length;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLength() {
        return length;
    }
    public String getType() {
        return type;
    }
    public String getName() {
        return name;
    }
    public String toString() {
        return "This "+this.name+" is "+this.length+" "+this.type;
    }
}