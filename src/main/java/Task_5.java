import java.util.Scanner;

public class Task_5 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите число в бинарном формате: ");
        String x = scanner.nextLine();
        System.out.println("Целое число: " + Integer.parseInt(x, 2));
    }
}