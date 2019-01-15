import java.util.Scanner;

public class Task_10 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите текст: ");
        String text = scanner.nextLine();
        System.out.print("Введённый текст: " + text);
    }
}