// Необходимо написать программу, которая будет выводить на экран текстовые данные из файла .txt

import java.io.FileReader;
import java.util.Scanner;

public class Task_15 {

    public static void main(String[] args) throws Exception {

        FileReader fr= new FileReader("Test.txt");
        Scanner scan = new Scanner(fr);

        while (scan.hasNextLine()) {
            System.out.println(scan.nextLine());
        }
        fr.close();
    }
}
