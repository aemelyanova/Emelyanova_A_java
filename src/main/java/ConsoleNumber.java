package main.java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleNumber extends Console{
    public void consoleNumberInput() {
        double number = 0;
        Scanner console = new Scanner(System.in);
        System.out.println("Введите число больше 7:");
        try {
            number = console.nextDouble();
            if (number > 7) {
                System.out.println("Привет");
            }
        } catch (InputMismatchException e) {
            System.out.println("Введено недопустимое значение");
        }
    }
}

