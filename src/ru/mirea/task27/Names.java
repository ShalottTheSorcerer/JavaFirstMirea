package ru.mirea.task27;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Names {
    public static void main(String[] args) {
        Map<String, String> names = new HashMap<>();
        names.put("Babaeva", "Zinaida");
        names.put("Belova", "Maria");
        names.put("Frolov", "Pyotr");
        names.put("Grynko", "Valery");
        names.put("Korenko", "Maria");
        names.put("Djak", "Maria");
        names.put("Ordun", "Luka");
        names.put("Vlasov", "Pyotr");
        names.put("Vodjanov", "Valery");
        names.put("Moroz", "Maria");
        System.out.println("Before:");
        System.out.println(names);
        ArrayList<String> values = new ArrayList<>(names.values());
        ArrayList<String> new_values = new ArrayList<>(names.values());
        for (int i = 0; i < new_values.size(); i++) {
            String name = new_values.get(i);
            if (values.indexOf(name) == values.lastIndexOf(name)) {
                values.remove(name);
            }
        }
        new_values = new ArrayList<>(names.keySet());
        for (int i = 0; i < values.size(); i++) {
            String name = values.get(i);
            for (int j = 0; j < new_values.size(); j++) {
                if (names.get(new_values.get(j)) == name) {
                    names.remove(new_values.get(j));
                }
            }
        }
        System.out.println("After:");
        System.out.println(names);
    }
}
