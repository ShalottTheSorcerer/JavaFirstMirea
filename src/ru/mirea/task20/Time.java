package ru.mirea.task20;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Time {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = "";
        String name;
        System.out.println("Enter the developer's surname:");
        name = sc.nextLine();
        System.out.println("Enter the date of the start as \"yyyy-MM-dd\":");
        str = sc.nextLine();
        str += " ";
        System.out.println("Enter the time of the start as \"HH:mm\":");
        str += sc.nextLine();
        str += ":00";
        SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss");
        Date date;
        try {
            date = ft.parse(str);
            System.out.println(name+" has got their task at "+ date);
        }catch (ParseException e) {
            System.out.println("Wrong format");
            return;
        }
        int month = Integer.parseInt(str.substring(5, 7));
        month += 1;
        String newString = "";
        if (month == 13) {
            newString = str.substring(0, 5) + "01"+ str.substring(7);
        } else if (Integer.toString(month).length() == 1) {
            newString = str.substring(0, 5) + "0" + month + str.substring(7);
        } else {
            newString = str.substring(0, 5) + month + str.substring(7);
        }
        try {
            date = ft.parse(newString);
            System.out.println(name+" has got 1 month to finish the task");
            System.out.println("The date of the deadline is: "+ date);
        }catch (ParseException e) {
            System.out.println("Wrong format");
            return;
        }
    }
}
