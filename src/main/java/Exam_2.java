// Написать программу сортировки по возрастанию заданного пользователем массива чисел

import java.util.Arrays;
import java.util.Scanner;

public class Exam_2 {

    static Scanner scanner = new Scanner(System.in);

    // Сбор данных о длинне и содержимом массива

    public static void main(String[] args) {
        System.out.println("Укажите максимальное количество значений в массиве: ");
        int amount = scanner.nextInt();
        int mas[] = new int[amount];
        for (int i = 0; i < amount; ++i) {
            System.out.println("Задайте элемент массива[№" + i + "]:");
            mas[i] = scanner.nextInt();
        }

        // Сортировка массива по возрастанию

            boolean isSorted = false;
            int buf;
            while (!isSorted) {
                isSorted = true;
                for (int i = 0; i < mas.length - 1; i++) {
                    if (mas[i] > mas[i + 1]) {
                        isSorted = false;

                        buf = mas[i];
                        mas[i] = mas[i + 1];
                        mas[i + 1] = buf;
                    }
                }
            }
            System.out.println("Результат сортировки массива: " + Arrays.toString(mas));
        }
    }
