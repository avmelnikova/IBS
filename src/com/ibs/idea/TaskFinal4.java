package com.ibs.idea;

import java.util.Scanner;

/*
Напишите программу-загадку: “Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает”. Ответ: “Заархивированный вирус”.

У пользователя есть 3 попытки, чтобы отгадать загадку.
Если пользователь ввел верный ответ, вывести: “Правильно!” и завершить работу.
Если пользователь ввел неверный ответ на 1 или 2 попытке, вывести “Подумай еще!” и еще раз запросить ответ у пользователя.
Если пользователь сделал 3 неправильных попытки, вывести “Обидно, приходи в другой раз” и завершить работу.
Также пользователь имеет право на подсказку при первой попытке, при этом 2 и 3 попытки уже недоступны.
Если на первой попытке он введет строку “Подсказка”, вывести любую подсказку. Если на 2 и 3, вывести “Подсказка уже недоступна”.
Если пользователь, использовавший подсказку, ошибется, вывести “Обидно, приходи в другой раз” и завершить работу.
 */

public class TaskFinal4 {
    public static void main(String[] args) {
        String puzzleText = "Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает";
        String rightAnswer = "Заархивированный вирус";
        String congratulationText = "Правильно!";
        String wrongAnswerText = "Подумай еще!";

        String tipKeyword = "Подсказка";
        String tipText = "ответ: Заархивированный вирус";
        String tipNotAvailable = "Подсказка уже недоступна";

        String gameOverText = "Обидно, приходи в другой раз";

        Scanner input = new Scanner(System.in);

        System.out.println("Загадка: " + puzzleText);

        int maxAttempts = 3;

        boolean isTipShowed = false;

        for (int i = 1; i <= maxAttempts; i++) {
            String answer = input.nextLine();

            boolean isRightAnswer = answer.equals(rightAnswer);
            boolean isTipInFirstAttempt = (answer.equals(tipKeyword) && i == 1);
            boolean isGameOver = (i == maxAttempts || isTipShowed);
            boolean isTipKeywordAndAttemptOutOfRange = answer.equals(tipKeyword) && i > 1;

            if (isRightAnswer) {
                System.out.println(congratulationText);
                break;
            }

            if (isTipInFirstAttempt) {
                System.out.println(tipText);
                isTipShowed = true;
                continue;
            }

            if (isGameOver) {
                System.out.println(gameOverText);
                break;
            }

            if (isTipKeywordAndAttemptOutOfRange) {
                System.out.println(tipNotAvailable);
                continue;
            }

            System.out.println(wrongAnswerText);
        }
    }
}