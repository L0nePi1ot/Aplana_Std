//Необходимо написать программу, которая будет выводить на экран текстовые данные из файла .txt,
//а потом в этот же файл перезаписывать текстовые данные, введенные вручную.
//Количество строк после перезаписи должно быть столько же, сколько и в изначальном варианте.

import java.io.*;

public class Task_17 {

    public static void main(String[] args) {
        String s;
        int i, j;
        i = j = 0;

        try(BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {

            while((s = br.readLine())!= null){
                System.out.print(s + "\n");

                i += 1;
            }

            String str;
            BufferedReader brd = new BufferedReader (new InputStreamReader(System.in));
            System.out.println("Для обработки строки - введите команду 'stop'");

            try(FileWriter fw = new FileWriter("test.txt", false)) {
                do {
                    System.out.print("Введите текст: ");
                    str = brd.readLine();

                    if(str.compareTo("stop") == 0) break;

                    str += "\r\n";
                    fw.write(str);

                    j += 1;

                    if (j > i) {
                        System.out.print("Ошибка! В последующем тексте количество строк больше чем в изначальном (3)");
                        break;
                    }
                }
                while (str.compareTo("stop")!= 0);
                if (i > j){
                    System.out.print("Ошибка! В последующем тексте количество строк меньше чем в изначальном (3)");
                }
            }
            catch(IOException ex){
                System.out.println(ex.getMessage());
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}