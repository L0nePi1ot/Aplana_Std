//Написать программу, которая будет выводить таблицу умножения для введенного пользователем числа с клавиатуры.

import java.util.Scanner;

public class Exam_1 {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите множимое число:");
        double number = scanner.nextDouble();
        System.out.println("Введите количество множителей:");
        int count = scanner.nextInt();

        for (int i=1; i<=count; i++) {
            System.out.println (number + "*" + i + "=" + number*i);
        }
    }
}