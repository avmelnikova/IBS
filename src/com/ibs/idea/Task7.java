package com.ibs.idea;

import java.util.Scanner;

/*
Напишите программу:
1. Пользователь вводит размер массива и данные с клавиатуры в массив
2. Сравнить элементы массива с заранее заданными константами x, y, z.
3. Если массив содержит хотя бы одну из констант, вывести текст "Данное значение имеется в константах".
 */

public class Task7 {
    public static void main(String[] args) {
        final int x = 1;
        final int y = 2;
        final int z = 3;
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размерность массива: ");
        int size = input.nextInt();
        int array[] = new int[size];
        System.out.println("Введите элементы:");
        for (int i = 0; i < size; i++)
            array[i] = input.nextInt();

        for (int i = 0; i < size; i++) {
            int element = array[i];
            if (element == x || element == y || element == z) {
                System.out.println("Данное значение имеется в константах");
                break;
            }
        }
    }
}

