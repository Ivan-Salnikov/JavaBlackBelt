package edu.work_with_files;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) throws IOException {

//        FileReader reader = null;
        try (FileReader reader = new FileReader("test2.txt")){
//            reader = new FileReader("test2.txt");
            int character;

            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            System.out.println("");
            System.out.println("Done!");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
//        finally {
//            reader.close();
//        }
    }
}
