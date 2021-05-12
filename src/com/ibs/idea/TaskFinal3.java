package com.ibs.idea;

import java.util.Scanner;

/*
Напишите программу, где пользователь вводит сначала количество строк n, затем сами строки.
Среди данных строк найти строку с максимальным количеством различных символов. Если таких строк будет много, то вывести первую.

Пример для теста работы программы:

Количество строк: 3
Строка 1: привет
Строка 2: анализ
Строка 3: 111111111111
Ответ: привет
 */

public class TaskFinal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите количество строк: ");
        int size = input.nextInt();
        String array[] = new String[size];

        Scanner inputString = new Scanner(System.in);
        System.out.println("Введите строки: ");
        for(int i = 0; i < size; i++){
            System.out.print("Строка " + (i+1) + " : ");
            array[i] = inputString.nextLine();
        }

        long maxCount = 0;
        int maxCountIndex = 0;
        for(int i = 0; i < size; i++){
            long countChar = array[i].chars().distinct().count();
            if (countChar > maxCount){
                maxCount = countChar;
                maxCountIndex = i;
            }
        }

        System.out.println("Ответ : " + array[maxCountIndex]);
    }
}
