//Необходимо написать программу, которая будет реализовывать следующие действия:
//1. Ввод числа с клавиатуры и запись его в строковую переменную S
//
//2. Конвертация строковой переменной S в числовую переменную X типа int
//
//3. Конвертация числа X типа int в число Y типа double
//
//Все три числа разных типов необходимо в столбик вывести на экран

import java.util.Scanner;

public class Task_13 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите число: ");
        String S = scanner.nextLine(); // Запись введённого числа в переменную типа String
        int X = Integer.parseInt(S); // Преобразование переменной String в int
        double Y = (double)X; // Преобразование int в double
        System.out.println("String = " + S + ", int = " + X + ", double = " + Y); // вывод значения 3х типов переменных в консоль
    }
}
