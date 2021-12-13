package ru.mirea.task27;

import java.util.*;

public class CityTest {
    public static void main(String[] args) {
        City paris = new City("Paris","France");
        City toulouse = new City("Toulouse", "France");
        City vienna = new City("Vienna","Austria");
        City berlin = new City("Berlin", "Germany");
        Map<String, ArrayList<String>> map = new HashMap();
        map.put(paris.country, new ArrayList<>(Arrays.asList(paris.name, toulouse.name)));
        map.put(vienna.country, new ArrayList<>(Arrays.asList(vienna.name)));
        map.put(berlin.country, new ArrayList<>(Arrays.asList(berlin.name)));
        System.out.println(map);
    }
}
