// Напишите программу конвертер валют. Программа должна переводить рубли в доллары по текущему курсу. Пользователь вводит текущий курс и количество рублей.

import java.util.Scanner;

public class Exam_3 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите текущий курс 1 доллара США к рублю по данным ЦБ РФ (cbr.ru):");
        double usd = scanner.nextDouble();
        System.out.println("Введите количество рублей:");
        double rub = scanner.nextDouble();
        double res = (rub/usd);
        System.out.printf("Результат в долларах США = " + "%.2f", res);
    }
}