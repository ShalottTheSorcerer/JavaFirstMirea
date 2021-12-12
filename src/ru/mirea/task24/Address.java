package ru.mirea.task24;

import java.util.Scanner;

public class Address {

    private static void check(String new_address) {
        System.out.println("Your input is: "+new_address+"\nThe result of the matching: "+new_address.matches("^(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])(\\.(?!$)|$)){4}$"));
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String new_address = sc.nextLine();
        check(new_address);
    }
}
