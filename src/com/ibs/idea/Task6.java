package com.ibs.idea;

import java.util.Scanner;

/*
Напишите программу конвертер физических величин:

1. Пользователю предлагается на выбор ввести массу или расстояние. Пример:
> Выберите что переводить: 1 - масса, 2 - расстояние
> 2

2. Пользователю предлагается выбрать единицу измерения. Пример:
> Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут
> 1

3. Пользователю предлагается ввести количество выбранных единиц:
> Введите число
> 10
> Результат:
> Метры: 10
> Мили: 0.006
> Ярды: 10.94
> Футы: 32.81
 */

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double DISTANCE_MI = 0.0006D;
        double DISTANCE_YA = 1.094D;
        double DISTANCE_FT = 3.28D;
        double WEIGHT_G = 1000.0D;
        double WEIGHT_LB = 2.204D;
        double WEIGHT_OZ = 35.274D;
        System.out.println("Выберите что конвертировать\n1 - масса\n2 - расстояние ");
        int n = sc.nextInt();
        int m;
        int distance;
        double result_m;
        double result_mi;
        double result_ya;
        double result_ft;
        if (n == 2) {
            System.out.println("Выберите единицу измерения\n1 - метр\n2 - миля\n3 - ярд\n4 - фут");
            m = sc.nextInt();
            System.out.println("Введите расстояние");
            distance = sc.nextInt();
            result_m = 0.0D;
            result_mi = 0.0D;
            result_ya = 0.0D;
            result_ft = 0.0D;
            switch(m) {
                case 1:
                    result_m = distance;
                    result_mi = (double)distance * DISTANCE_MI;
                    result_ya = (double)distance * DISTANCE_YA;
                    result_ft = (double)distance * DISTANCE_FT;
                    break;
                case 2:
                    result_m = (double)distance / DISTANCE_MI;
                    result_mi = distance;
                    result_ya = (double)distance / DISTANCE_MI * DISTANCE_YA;
                    result_ft = (double)distance / DISTANCE_MI * DISTANCE_FT;
                    break;
                case 3:
                    result_m = (double)distance / DISTANCE_YA;
                    result_mi = (double)distance / DISTANCE_YA * DISTANCE_MI;
                    result_ya = distance;
                    result_ft = (double)distance / DISTANCE_YA * DISTANCE_FT;
                    break;
                case 4:
                    result_m = (double)distance / DISTANCE_FT;
                    result_mi = (double)distance / DISTANCE_FT * DISTANCE_MI;
                    result_ya = (double)distance / DISTANCE_FT * DISTANCE_YA;
                    result_ft = distance;
            }

            System.out.println("Метры: " + result_m + "\nМили: " + result_mi + "\nЯрды: " + result_ya + "\nФуты: " + result_ft);
        } else {
            System.out.println("Выберите единицу измерения\n1 - килограмм\n2 - грамм\n3 - фунт\n4 - унция");
            m = sc.nextInt();
            System.out.println("Введите вес");
            distance = sc.nextInt();
            result_m = 0.0D;
            result_mi = 0.0D;
            result_ya = 0.0D;
            result_ft = 0.0D;
            switch(m) {
                case 1:
                    result_mi = distance;
                    result_m = (double)distance * WEIGHT_G;
                    result_ya = (double)distance * WEIGHT_LB;
                    result_ft = (double)distance * WEIGHT_OZ;
                    break;
                case 2:
                    result_mi = (double)distance / WEIGHT_G;
                    result_m = distance;
                    result_ya = (double)distance / WEIGHT_G * WEIGHT_LB;
                    result_ft = (double)distance / WEIGHT_G * WEIGHT_OZ;
                    break;
                case 3:
                    result_mi = (double)distance / WEIGHT_LB;
                    result_m = (double)distance / WEIGHT_LB * WEIGHT_G;
                    result_ya = distance;
                    result_ft = (double)distance / WEIGHT_LB * WEIGHT_OZ;
                    break;
                case 4:
                    result_mi = (double)distance / WEIGHT_OZ;
                    result_m = (double)distance / WEIGHT_OZ * WEIGHT_G;
                    result_ya = (double)distance / WEIGHT_OZ * WEIGHT_LB;
                    result_ft = distance;
            }

            System.out.println("Килограммы: " + result_mi + "\nГраммы: " + result_m + "\nФунты: " + result_ya + "\nУнции: " + result_ft);
        }
    }
}

