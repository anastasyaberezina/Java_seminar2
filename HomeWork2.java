package Lesson2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

// Получилось что-то такое, нерабочее.

// Напишите метод, который составит строку, состоящую из 100 повторений слова
// TEST и метод, который запишет эту строку в простой текстовый файл,
// обработайте исключения.
public class HomeWork2 {
    public static StringBuilder main(String[] args) {
        WorkFile text = new WorkFile();
        text.record();

            public StringBuilder composingString() {
                StringBuilder string = new StringBuilder();
                for (int i = 0; i <= 100; i++) {
                    string.append("TEST");
                }
                return string;
            }

        public static void record(){
            try{
                FileOutputStream file1 = new FileOutputStream("FileforHW.txt");
                file1.write(composingString().toString().getBytes());
                file1.close();
            } catch (IOException e) {
                System.out.println("Проблема!");
        }
    }
}

