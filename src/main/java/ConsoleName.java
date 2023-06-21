package main.java;

import java.util.Scanner;

public class ConsoleName extends Console {
    public void consoleNameInput() {
        Scanner console = new Scanner(System.in);
        String name = "";
        System.out.println("Введите имя: ");

        if (console.hasNext()) {
            name = console.next();
        }
        if (name.equals("Вячеслав")) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
    }
}