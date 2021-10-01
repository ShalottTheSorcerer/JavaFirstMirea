package ru.mirea.task3.lab_02;

public class BookTest {
    public static void main(String[] args) {
        Book s1 = new Book("J.K. Rowling", 1994, "Harry Potter", 400);
        Book s2 = new Book();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1.getYear());
        System.out.println(s1.getAuthor());
        System.out.println(s1.getName());
        System.out.println(s1.getPages());
    }
}
