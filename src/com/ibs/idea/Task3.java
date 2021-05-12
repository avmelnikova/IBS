package com.ibs.idea;

/*
Задача №3_ Массивы
Выполните следующие действия с массивом:
1. Задайте массив из 5 любых целых чисел.
2. Поменяйте местами первый и последний элемент в массиве.
3. Вывести в консоль результат суммы первого и среднего элемента.
Примечание : Для получения последнего и среднего элементов в массиве используйте свойство length.
 */

public class Task3 {
    public static void main(String[] args) {
        int[] myArray = new int[]{5, 15, 10, 27, 48};
        int temp = myArray[myArray.length - 1];
        myArray[myArray.length - 1] = myArray[0];
        myArray[0] = temp;
        int first = myArray[0];

        int mid = myArray[myArray.length / 2];
        System.out.println(first + mid);
    }
}
