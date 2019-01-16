//Необходимо написать программу, которая будет записывать текстовые данные, введенные с экрана, в файл .txt.
// Запись ввести в файл до тех пор, пока не будет введена команда стоп в консоли.
// Пользователь при тестировании программы по правилу черного ящика должен понимать,
// какой принцип остановки записи в файл он должен подать.

import java.io.*;

public class Task_16 {

    public static void main(String[] args) {
        String flood;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Признак конца ввода - строка 'stop' ");

        try (FileWriter nFile = new FileWriter("Test.txt")) {

            do {
                System.out.print(": ");
                flood = br.readLine();

                if (flood.compareTo("stop") == 0) break;

                flood = flood + "\r\n";
                nFile.write(flood);
            } while (flood.compareTo("stop") != 0);
        } catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc);
        }
    }
}
