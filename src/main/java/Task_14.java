// Программа для сортировки данных массива по возрастанию, с использованием пузырькового метода сортировки.

import java.util.Arrays;

public class Task_14 {

    public static void main(String[] args) {
        int [] mas = {9, 2, 3, 5, 8, 1, 4, 6, 7, 0};

        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length-1; i++) {
                if(mas[i] > mas[i+1]){
                    isSorted = false;

                    buf = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = buf;
                }
            }
        }
        System.out.println("Результат пузырьковой сортировки массива: " + Arrays.toString(mas));
    }
}