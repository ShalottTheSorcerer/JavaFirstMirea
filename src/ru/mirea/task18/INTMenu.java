package ru.mirea.task18;

import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class INTMenu {
    public static void main(String[] args) throws Exception {
        ArrayList<String> INT = new ArrayList<String>();
        INT.add("142356781234");
        INT.add("846935787536");
        INT.add("879635824625");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter your individual tax number: ");
        String number = sc.nextLine();
        boolean b = INT.contains(number);
        try {
            if (b == false) throw new Exception("Your number is not in the list!");
        } catch(Exception e) {
            System.out.println("Please, try again");
            System.exit(-1);
        }
        System.out.println("Success");
    }
}

