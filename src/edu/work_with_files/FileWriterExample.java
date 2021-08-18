package edu.work_with_files;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) throws IOException {
        String rubai = "Много лет размышлял я над жизнью земной.\n" +
                "Непонятного нет для меня под луной.\n" +
                "Мне известно, что мне ничего не известно, —\n" +
                "Вот последний секрет из постигнутых мной.";

        String append = "Чуть позже решил что секрета здесь нет, \n" +
             "Ведь все это знают, но просто молчат";

        FileWriter writer = null;

        try {
            //writer = new FileWriter("C:\\Users\\User\\Desktop\\test.txt");
            writer = new FileWriter("test2.txt", true);

            /*
            // Посимвольная передача
            for(int i = 0; i < rubai.length(); i++) {
                writer.write(rubai.charAt(i));
            }
            */

            writer. append(append);

            System.out.println("Done!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            writer.close();
        }
    }

}
