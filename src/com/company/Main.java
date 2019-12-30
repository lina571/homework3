package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        String[] names = new String[3];
        names[0] = "Urmat";
        names[1] = "Arsen";
        names[2] = "Bek";
        for (int i = 0; i < 3; i++) {
            switch (names[i]) {
                case "Urmat":
                    System.out.println("Доброе утро " + names[0]);
                    break;
                case "Arsen":
                    System.out.println("Доброго дня " + names[1]);
                    break;
                case "Bek":
                    System.out.println("Добрый вечер " + names[2]);
            }

        }


    }
}
