package com.ibs.idea;

import java.util.Scanner;

/*
Задача №10_Циклы
Напишите программу, где пользователь вводит данные с клавиатуры в матрицу, а после этого произведите вывод первой строки матрицы на экран,
где каждый элемент умножается на 3. Размерность матрицы задается пользователем.
 */

public class Task10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размерность массива x: ");
        int sizeX = input.nextInt();
        System.out.println("Введите размерность массива y: ");
        int sizeY = input.nextInt();
        int array[][] = new int[sizeX][sizeY];
        System.out.println("Введите элементы:");
        for (int i = 0; i < sizeX; i++){
            for (int j = 0; j < sizeY; j++){
                array[i][j] = input.nextInt();
            }
        }

        System.out.println("Результирующая матрица");

        for (int i = 0; i < sizeX; i++){
            System.out.print(array[i][0] * 3 + " ");
        }
    }
}
