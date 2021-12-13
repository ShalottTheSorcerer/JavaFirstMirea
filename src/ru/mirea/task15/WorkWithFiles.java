package ru.mirea.task15;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class WorkWithFiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            System.out.println("Enter your data:");
            try (FileWriter writer = new FileWriter("CleanFile", false)) {
                String str = sc.nextLine();
                writer.write(str);
                //writer.flush();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
            try (FileReader reader = new FileReader("CleanFile")) {
                int c;
                System.out.println("The content inside the file:");
                while ((c = reader.read()) != -1) {
                    System.out.print((char) c);
                }
                System.out.print("\n");
            } catch (IOException ex) {

                System.out.println(ex.getMessage());
            }
        }
        System.out.println("Enter your data:");
        try (FileWriter writer = new FileWriter("CleanFile", true)) {
            String str = sc.nextLine();
            writer.write(str);
            //writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        try (FileReader reader = new FileReader("CleanFile")) {
            int c;
            System.out.println("The content inside the file after the append:");
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }
            System.out.print("\n");
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}
