package Lesson2;

import java.util.Scanner;

public class Seminar {

    public static void main(String[] args) {
        bar();
    }

    private static void method() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первый символ строки: ");
        String string1 = scan.next();
        System.out.println("Введите второй символ строки: ");
        String string2 = scan.next();
        System.out.println("Длина финальной строки: ");
        int repeat = scan.nextInt(); //Возвращает сразу целое число
        StringBuilder builder = new StringBuilder();

        for (int i = 0; builder.length() < repeat; i++) {
            builder.append(string1).append(string2);
        }

        if (repeat % 2 != 0){
            builder.delete(builder.length() - 1, builder.length());
        }

        System.out.println(builder);

    }

    // 2е решение

/*    char a = ' ';
    char b = ' ';
    int strSize = 0;

    public static int userInput(String msg) {
          Scanner sc = new Scanner(System.in);
          int inputStr;
          while(true){
              System.out.print(msg);
              try{
                  inputStr = Integer.parseInt(sc.next());
                  breack;
              }catch (NumberFormatException e){
                  System.out.println("Неверный ввод! Введите целое число!");
              }
          }
          return  inputStr;
    }

    public static int charInput(String msg) {
        Scanner sc = new Scanner(System.in);
        int inputStr;
        while(true){
            System.out.print(msg);
            try{
                inputStr = Integer.parseInt(sc.next());
                breack;
            }catch (NumberFormatException e){
                System.out.println("Неверный ввод! Введите целое число!");
            }
        }
        return  inputStr;
    }
    int strSize = userInput("Введите размер строки: ");
}*/


    // Решение преподавателя. 1й вариант

  /*  static void foo(){
        char firstChar = 'a';
        char secondChar = '_';
        int n = 5;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0){
                sb.append(firstChar);
            } else {
                sb.append(secondChar);
            }
        }
        System.out.println(sb);
    }}*/

    // 2й вариант

    static void bar(){
        char firstChar = 'a';
        char secondChar = '_';
        String firstSymbolString = String.valueOf(firstChar); //Преобразуем в строку
        String secondSymbolString = secondChar + " ";
        int n = 5;

        if (n == 1){
            System.out.println(firstSymbolString);
            System.exit(0);
        }

        String strResult = firstSymbolString
                .concat(secondSymbolString)
                .repeat(n / 2)
                .concat((n % 2 == 1) ? firstSymbolString: " "); // Склеивание строк + повторение строк

        if (n % 2 == 1){
            strResult+=firstSymbolString;
        }
        System.out.println(strResult);
    }}

