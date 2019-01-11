import java.util.Scanner;

public class Task_4
{
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите 3 целых числа:");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        int a = (x + y + z) / 3;
        System.out.println("Среднее арифметическое число: " + a);
        if ((a / 2) > 3) {
            System.out.println("Программа выполнена корректно");
        }

    }
}