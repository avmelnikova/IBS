package com.ibs.idea;

import java.util.Scanner;

/*
Итоговая задача №1
Напишите программу конвертер валют. Программа должна переводить рубли в доллары по текущему курсу.
Пользователь вводит текущий курс и количество рублей. Итоговое значение должно быть округлено до двух знаков после запятой.
Пример для теста работы программы:

Курс доллара: 67,55
Количество рублей: 1000
Итого: 14,80 долларов
 */

public class TaskFinal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Курс доллара: ");
        double course = input.nextDouble();
        System.out.println("Количество рублей: ");
        int count = input.nextInt();
        double convertibleCurrency = count / course;

        System.out.println(String.format("Итого: %,.2f", convertibleCurrency));     // 1,234,567,890.12
    }
}
