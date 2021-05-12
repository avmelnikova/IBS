package com.ibs.idea;

import java.util.Scanner;

/*
Напишите программу, которая позволит решить простое уравнение относительно x. Программа принимает на вход строку длиной 5 символов.
Второй символ строки является знаком ‘+’ или ‘-’, четвертый символ строки ‘=’.
Первым, третьим и пятым символом являются две цифры (от 0 до 9) и буква ‘x’ (обозначает неизвестное) в любом порядке. Нужно найти неизвестное.

Пример для теста работы программы:

Ввод: x+5=7
Вывод: 2
Ввод: 3-x=9
Вывод: -6
Ввод: 3-3=x
Вывод: 0
 */

public class TaskFinal2 {
    public static int getOperation(char operation) {
        return operation == '+' ? -1 : 1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = input.nextLine();

        int result = 0;
        int posX = str.indexOf("x");
        switch (posX) {
            case 0:
                result = (int) (str.charAt(4) - '0') + (int) (str.charAt(2) - '0') * getOperation(str.charAt(1));
                break;
            case 2:
                result = (int) (str.charAt(0) - '0') - (int) (str.charAt(4) - '0') * getOperation(str.charAt(1));
                break;
            case 4:
                result = (int) (str.charAt(0) - '0') - ((int) (str.charAt(2) - '0') * getOperation(str.charAt(1)));
                break;
        }
        System.out.println("Результат x = " + result);
    }
}

