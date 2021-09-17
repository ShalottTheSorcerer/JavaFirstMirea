package ru.mirea.task4.prac_02;

public class Author {
    private String name;
    private String email;
    private char gender;

    public Author() {
        this.name = "Anna Alexandrova";
        this.email = "Alexxandrova@mail.ru";
        this.gender = 'F';
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public char getGender() {
        return gender;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String toString() {
        return this.name+" "+this.gender+" at "+this.email;
    }
}
