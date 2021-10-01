package ru.mirea.task2.prac_01;

public class TestBook {
    public static void main(String[] args) {
        Book s1 = new Book("J.K. Rowling","novel","Harry Potter");
        Book s2 = new Book();
        Book s3 = new Book("Test name");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
