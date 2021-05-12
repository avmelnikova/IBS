package com.ibs.idea;

import java.util.Scanner;

/*
Задача №4_Операторы
Написать программу, которая будет выполнять следующие действия:

1. Ввести три числа с клавиатуры x, y, z
2. Найти и вывести в консоль среднее арифметическое этих чисел.
3. Разделить среднее арифметическое на 2 и округлить в меньшую сторону
4. Если полученное число больше 3, то вывести на экран сообщение "Программа выполнена корректно"
 */

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число x:");

        int x;
        while(true) {
            try {
                x = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException err) {
                System.out.print("Попробуйте снова");
            }
        }

        System.out.println("Введите целое число y:");

        int y;
        while(true) {
            try {
                y = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException err) {
                System.out.print("Попробуйте снова");
            }
        }

        System.out.println("Введите целое число z:");

        int z;
        while(true) {
            try {
                z = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException err) {
                System.out.print("Попробуйте снова");
            }
        }

        int[] nums = new int[]{x, y, z};
        int result = 0;

        for(int i : nums) {
            result += i;
        }

        int average = result / nums.length;
        System.out.println("Среднее арифметическое введенных чисел: " + average);

        if (Math.floor(average / 2) > 3) {
            System.out.println("Программа выполнена корректно");
        }
        sc.close();
    }
}
