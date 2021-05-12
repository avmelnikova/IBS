package com.ibs.idea;

import java.util.Scanner;

/*
Задача №13_ Работа с данными
Напишите программу, где пользователь должен ввести строку из слов, разделенных пробелами. Например: “I love java 8 Я люблю java 14 core1”.
Выполните следующие действия:
1. Выведите слова, состоящие только из латиницы.
2. Выведите количество этих слов.
*/

public class Task13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = input.nextLine();

        String sub = "";
        int count = 0;
        String[] splitted = str.split("\\s+");
        for (int i = 0; i < splitted.length; i++) {
            sub = splitted[i];
            if (sub.matches("^[A-Z]||[a-z]*"))
            {
                System.out.println(sub);
                count++;
            }
        }
        System.out.println("Количество слов = " + count);
    }
}
