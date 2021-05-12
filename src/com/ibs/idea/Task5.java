package com.ibs.idea;

import java.util.Scanner;

/*
Напишите простой калькулятор:
1. Ввести 2 числа с клавиатуры, затем один из символов ‘+’, ‘-’, ‘*’ или ‘/’.
2. В зависимости от символа вывести в консоль результат выполнения соответствующей арифметической операции.
 */

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое целое число:");

        int x;
        while(true) {
            try {
                x = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException err) {
                System.out.print("Попробуйте снова");
            }
        }

        System.out.println("Введите второе целое число:");

        int y;
        while(true) {
            try {
                y = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException err) {
                System.out.print("Попробуйте снова");
            }
        }

        System.out.println("Введите один арифметический символ (+, -, *, /):");
        String symbol = sc.nextLine();

        switch(symbol) {
            case "+":
                System.out.println(x + y);
                break;
            case "-":
                System.out.println(x - y);
                break;
            case "*":
                System.out.println(x * y);
                break;
            case "/":
                if (y != 0) {
                    System.out.println(x / y);
                } else {
                    System.out.println("Делить на 0 нельзя");
                }
        }
    }
}
