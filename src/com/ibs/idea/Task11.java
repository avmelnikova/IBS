package com.ibs.idea;

import java.util.Scanner;

/*
Задача №11_Работа с данными
Напишите программу:
1. Ввести первое число с клавиатуры и записать его в строковую переменную.
2. Ввести второе число с клавиатуры и сохранить его в целочисленную переменную типа int.
3. Сравнить 2 числа и вывести большее на экран.
4. Выведите также меньшее число на экран, предварительно переконвертировать его в тип double.
 */

public class Task11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        String number1 = Integer.toString(input.nextInt());
        System.out.println("Введите второе число: ");
        int number2 = input.nextInt();

        int number1Int = Integer.parseInt(number1);
        System.out.println("result :");
        if (number1Int > number2){
            System.out.println(number1Int);
            System.out.println((double)number2);
        }
        else{
            System.out.println(number2);
            System.out.println((double)number1Int);
        }
    }
}
