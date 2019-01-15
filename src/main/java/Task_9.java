import java.util.Scanner;

public class Task_9 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Укажите высоту и длинну матрицы: ");
        int h = scanner.nextInt();
        int l = scanner.nextInt();
        int mas[][] = new int[h][l];
        for (int j = 0; j < h; ++j){
            for (int i = 0; i < l; ++i) {
                System.out.println("Укажите значение строки[" + j + "] столбца[" + i + "]:");
                mas[j][i] = scanner.nextInt();
            }
        }
        for (int t = 0; t < l; ++t) {
            System.out.println("Значение ячейки[0][" + t + "] умноженное на 3 = " + mas[0][t]*3 );
        }
    }
}