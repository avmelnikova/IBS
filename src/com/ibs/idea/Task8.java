package com.ibs.idea;

import java.util.Scanner;

/*
Задача №8_ Циклы
Напишите программу, где пользователь вводит любое целое положительное число n. А программа суммирует все нечетные числа от 1 до введенного пользователем числа n.
 */

public class Task8 {
        public static void main(String[] args) {
            System.out.print("Введите любое целое положительное число: ");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int sum = 0;
            for (int i=1; i <= n; i++){ //проверяем до введенного числа включительно (если нужно не включительно, то пишем i < n)
                if (i % 2 != 0)
                    sum = sum + i;
            }
            System.out.println (sum);
        }
    }
