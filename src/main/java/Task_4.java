import java.util.Scanner;

public class Task_4 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите 3 числа:");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double z = scanner.nextDouble();
        double a = (x + y + z) / 3;
        System.out.println("Среднее арифметическое число: " + a);
        int b = (int)a;
        if ((b / 2) > 3) {
            System.out.println("Программа выполнена корректно");
        }
    }
}