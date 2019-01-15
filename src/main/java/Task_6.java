import java.util.Scanner;

public class Task_6 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int x = 3;
        int y = 6;
        int z = 9;
        System.out.println("Введите целое число: ");
        int t = scanner.nextInt();
        if (t == x || t == y || t == z) {
            System.out.println("Данное значение имеется в константах");
        }
        else {
            System.out.println("Такой константы нет!");
        }
    }
}