package ru.mirea.task29;

import java.io.*;
import java.util.Arrays;

public class CurrencyInfo implements Serializable {
    private static final long serialVersionUID = 1L;
    private String[] coinSet;
    private String[] coinCourse;
    public CurrencyInfo(String[] coinSet, String[] coinCourse) {
        this.coinCourse = coinCourse;
        this.coinSet = coinSet;
    }

    public String[] getCoinCourse() {
        return coinCourse;
    }

    public String[] getCoinSet() {
        return coinSet;
    }

    public void setCoinCourse(String[] coinCourse) {
        this.coinCourse = coinCourse;
    }

    public void setCoinSet(String[] coinSet) {
        this.coinSet = coinSet;
    }
    public String toString() {
        return "CurrencyInfo{" +
                "coinSet=" + Arrays.toString(coinSet) +
                ", coinCourse=" + Arrays.toString(coinCourse) +
                '}';
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String[] coinSet = {"5 gold coins", "12 silver coins", "33 bronze coins"};
        String[] coinCourse = {"1 gold coin = 10 silver coin", "1 silver coin = 10 bronze coin"};

        CurrencyInfo info = new CurrencyInfo(coinSet, coinCourse);
        FileOutputStream outputStream = new FileOutputStream("save.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(info);
        objectOutputStream.close();

        try (FileReader reader = new FileReader("save.ser")) {
            int c;
            System.out.println("Before the deserialization:");
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }
            System.out.print("\n\n");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("After the deserialization:");
        FileInputStream fileInputStream = new FileInputStream("save.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        CurrencyInfo outputInfo = (CurrencyInfo) objectInputStream.readObject();
        System.out.println(outputInfo);
    }
}
