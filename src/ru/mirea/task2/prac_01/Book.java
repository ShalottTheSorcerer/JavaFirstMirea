package ru.mirea.task2.prac_01;

public class Book {
    private String author;
    private String type;
    private String name;

    public Book(String a, String t, String n) {
        author = a;
        type = t;
        name = n;
    }
    public Book() {
        author = "John Dow";
        type = "novel";
        name = "Test name";
    }
    public Book(String n) {
        author = "John Dow";
        type = "novel";
        name = n;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String toString() {
        return "The "+this.name+" is the "+this.type+" of "+this.author;
    }
}
