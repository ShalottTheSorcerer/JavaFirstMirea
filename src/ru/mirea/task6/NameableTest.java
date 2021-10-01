package ru.mirea.task6;

public class NameableTest {
    public static void main(String[] args) {
        Cat s1 = new Cat("Dusya", "siamese", 5);
        Cat s2 = new Cat("Sophie", "persian", 2);
        Planet s3 = new Planet("Venus",2);
        Planet s4 = new Planet("Neptune",8);
        s1.getName();
        s2.getName();
        s3.getName();
        s4.getName();
    }
}
