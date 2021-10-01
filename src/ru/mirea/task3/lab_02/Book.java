package ru.mirea.task3.lab_02;

public class Book {
    private String author;
    private int year;
    private String name;
    private int pages;

    public Book(String a, int y, String n, int p) {
        author = a;
        year = y;
        name = n;
        pages = p;
    }
    public Book() {
        author = "John Dow";
        year = 2000;
        name = "Test name";
        pages = 200;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPages() {
        return pages;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String toString() {return "The "+this.name+" is the "+this.pages+" pages book of "+this.author+" written in "+this.year;}
}
