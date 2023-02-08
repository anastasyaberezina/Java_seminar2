package Lesson2;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        pall();
    }

    // Напишите метод, который принимает на вход строку (String) и
    // определяет является ли строка палиндромом (возвращает boolean значение).
    public static void pall() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Проверить на палиндром: ");
        String str = scan.next();  // Беру введенные данные с терминала
        String st = new String(str); //Создаю дубль имеющейся строки
        String[] first = str.split(""); //Привожу к массиву первую строку
        String[] second = st.split(""); //Вторую строку

        for (int i = 0; i < str.length() - 1; i++) { //Запускаю двойной цикл для проверки
            for (int j = st.length()-1 ; j >= 0; j--) {
                // second[j] = new StringBuilder(first[i]).reverse().toString(); //Пытаюсь в процессе переворачивать строку
                // while (str.length() % 2 == 0) { // Цикл для четных строк?
                if (first[i] == second[j]) {
                    System.out.println(true);
                } else {
                    System.out.println(false);  // Что-то неправильно делаю, все время false
                }
            }
        }
    }
}
