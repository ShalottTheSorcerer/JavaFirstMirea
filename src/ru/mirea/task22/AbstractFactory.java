package ru.mirea.task22;

public class AbstractFactory {
    public Chair createChair(ChairType type) {
        Chair chair = null;
        switch (type) {
            case VICTORIAN:
                chair = new Victorian();
                break;
            case MULTIFUNCTIONAL:
                chair = new Multifunctional();
                break;
            case MAGICK:
                chair = new Magick();
                break;
        }
        return chair;
    }
}
