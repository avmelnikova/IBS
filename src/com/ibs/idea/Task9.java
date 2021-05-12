package com.ibs.idea;

import java.util.Scanner;

/*
Задача №9_ Циклы
Напишите программу:
1. Пользователь вводит размер массива и данные с клавиатуры в массив типа double.
2. Посчитайте среднее арифметическое элементов массива.
3. После этого произведите вывод массива на экран, где каждый элемент массива умножается на среднее арифметическое
 */

public class Task9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размерность массива: ");
        int size = input.nextInt();
        double array[] = new double[size];
        System.out.println("Введите элементы:");
        for (int i = 0; i < size; i++)
            array[i] = input.nextDouble();

        double sum = 0;
        for (int i = 0; i < size; i++)
            sum += array[i];

        double avg = sum / size;

        for (int i = 0; i < size; i++){
            System.out.print("элемент " + i + " = " + array[i] * avg);
            System.out.println();
        }
    }
}
