package com.exersise18;

import java.io.*;
import java.io.InputStreamReader;
public class Main {

    public CountStr() {

        final File file = new File("test.txt");

        {
            LineNumberReader lnr = null;
            try {
                lnr = new LineNumberReader(new FileReader(file));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            int linesCount;
            linesCount = 0;
            while (true) {
                try {
                    if (null != lnr.readLine()) break;
                } catch (IOException e) {
                    e.printStackTrace();
                }
                linesCount += 1;
            }
            System.out.println("Количество строк в файле: " + linesCount);
        }
    }

    public static void main(String[] args, String linesCount)
    {

        System.out.println("Вывод содержимого файла: ");
        String s;
        try (BufferedReader br =
                new BufferedReader (new FileReader ("test.txt")))
        {
            while ((s = br.readLine()) != null) {
                System.out.println (s);
            }
        } catch (IOException exc) {
            System.out.println("Ошибка вывода: " + exc);
        }


        String str;
        BufferedReader br =
                new BufferedReader (
                        new InputStreamReader(System.in));
        System.out.println("Запись в файл закончится, когда строк будет столько же, сколько было в файле: ");

        try (FileWriter fw = new FileWriter("test.txt")) {

            do {
                System.out.print(": ");
                str = br.readLine();
                if (int i = str.compareTo(linesCount);
                str = str + "\r\n";
                fw.write(str);
            } while (str.compareTo(linesCount) != 0);
        } catch(IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc);

        }
    }
}
