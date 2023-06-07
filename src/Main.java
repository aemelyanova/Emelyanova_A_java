import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int number = 0;
        Scanner console = new Scanner(System.in);
        System.out.println("Введите целое число больше 7:");
        if (console.hasNextInt()) {
            number = console.nextInt();
            if (number > 7) {
                System.out.println("Привет");
            }
        }

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

        int sizeArray = 0;
        System.out.println("Введите длину массива: ");
        sizeArray = console.nextInt();
        int array[] = new int[sizeArray];

        System.out.println("Введите " + sizeArray + " целое(-ых) число(-ел) (через пробел): ");

        for (int i = 0; i < array.length; i++) {
            array[i] = console.nextInt();
        }

        for (int i = 0; i < sizeArray; i++) {
            if ((array[i] % 3 == 0) && (array[i] != 0)) {
                System.out.println("Элемент массива кратный 3: " + array[i]);
            }
        }
        console.close();
    }
}