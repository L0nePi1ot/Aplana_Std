// Для введенной с клавиатуры строки необходимо провести отсев пробелов. Результат в виде строки без пробелов вывести на экран.

import java.util.Scanner;

public class Task_11 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите текст: ");
        String nospace = scanner.nextLine();
        String nospace1 = nospace.replaceAll("\\s","");
        System.out.println("Введённый текст без пробелов: " + nospace1);
    }
}