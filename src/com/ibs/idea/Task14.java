package com.ibs.idea;

import java.util.Scanner;

/*
Напишите программу, заполняющую массив из 15 элементов рандомными значениями в диапазоне от -20 до 20. Далее:
1. Выведите максимальный и минимальный элемент массива.
2. Из максимального и минимального значения выведите наибольшее по модулю.
 */

public class Task14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размерность массива: ");
        int size = input.nextInt();
        int array[] = new int[size];
        for(int i = 0; i < size; i++){
            array[i] = (int) Math.round((Math.random() * 40) - 20);
        }

        int min = 20;
        int max = -20;
        for(int i = 0; i < size; i++){
            int element = array[i];
            if (element > max)
                max = element;

            if (element < min)
                min = element;
        }

        for(int i = 0; i < size; i++){
            System.out.print(array[i] + " ");
        }

        System.out.println();
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);

        max = Math.abs(max);
        min = Math.abs(min);
        System.out.println("Наибольшее по модулю = " + (max > min ? max : min));
    }
}
