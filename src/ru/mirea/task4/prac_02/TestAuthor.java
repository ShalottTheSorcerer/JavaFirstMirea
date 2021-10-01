package ru.mirea.task4.prac_02;

public class TestAuthor {
    public static void main(String[] args) {
        Author x = new Author("Jane Dow", "JaneD@mail.com", 'F');
        x.toString();
        x.setEmail("JaneJane@mail.com");
        System.out.println(x);
        System.out.println(x.getGender());
        System.out.println(x.getName());
        System.out.println(x.getEmail());
    }
}
