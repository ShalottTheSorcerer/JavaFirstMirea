package ru.mirea.task30;

public class Address {
    public static boolean check(String new_address) {
        return(new_address.matches("^(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])(\\.(?!$)|$)){4}$"));
    }
}
