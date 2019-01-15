//Необходимо провести сравнение длинны двух строк, которые были введены с клавиатуры и записаны в соответствующие переменные. Вывести на экран строку с наибольшей длинной.

import java.util.Scanner;

public class Task_12 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите 2 строки: ");
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        int lenA = a.length();
        int lenB = b.length();

        if(lenA > lenB) {
            System.out.println("Более длинной строкой является = " + a + " (" + lenA + " символов против " + lenB + ")");
        }
        else {
            System.out.println("Более длинной строкой является = " + b + " (" + lenB + " символов против " + lenA + ")");
        }
    }
}
