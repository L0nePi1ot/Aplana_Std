import java.util.Scanner; // ипорт сканера

public class Task_8 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Укажите максимальное количество значений в массиве: ");
        int amount = scanner.nextInt();
        int x[] = new int[amount];
        for (int i = 0; i < amount; ++i) {
            System.out.println("Задайте элемент массива[№" + i + "]:");
            x[i] = scanner.nextInt();
        }
        for (int j = 0; j < amount; ++j) {
            System.out.println("Эллемент массива[№" + j + "] умноженный на 2: " + x[j]*2 );
        }
    }
}