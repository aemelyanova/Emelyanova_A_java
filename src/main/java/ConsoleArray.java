package main.java;

import java.util.Scanner;

public class ConsoleArray extends Console {
    public void consoleArrayInput() {
        Scanner console = new Scanner(System.in);
        String newStr = "";
        System.out.print("Введите целые числа через запятую : ");

        if (console.hasNext()) {
            newStr = console.next();
        }
        String[] arrStr = newStr
                .replaceAll(" ", "")
                .replaceAll("[a-zA-Zа-яА-Я_]", "")
                .replaceAll("[;!#$%&<>:|]", "")
                .split(",");
        int[] arr = new int[arrStr.length];
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arrStr == null) {
                System.out.println("Введенный массив пустой");
            } else {
                try {
                    arr[counter] = Integer.valueOf(arrStr[i]);
                    counter++;
                } catch (NumberFormatException e) {
                    System.out.println("Введенный массив содержит недопустистимые символы");
                }
            }
        }

        for (int i = 0; i < counter; i++) {
            if (arr[i] % 3 == 0) {
                System.out.print(" " + arr[i]);
            }
        }
        console.close();
    }
}