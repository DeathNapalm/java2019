package com.javalesson.chapter1.task3;


/**
 * Напишите программу которая  проверяет введенное с клавиатуры число и говорит
 * является ли данное число палиндромом.
 * Палиндром - это число которое читается одинаково и спереди назад и сзади наперед.
 * Примеры 12321, 45654, 787 и т.д.
 * <p>
 * Дополнительное условие: программа принимает только числа длинной 5 знаков.
 * В случае если было введено число длинной != 5, программа должна выполнить еще
 * одно прохождение цикла и попросить снова ввести значение с клавиатуры.
 * У данной задачи есть разные варианты решения.
 * 1) С помощью конвертации чисел в строки и обратно.
 * 2) Решение с помощью щю использования остатка от деления на 10.
 * <p>
 * Вам нужно выполнить задания двумя способами.
 */

import java.util.Scanner;

public class PalindromeFinderTask {

    public static void main(String[] args) {
        System.out.println("ВВедите потенциальный полиндром");
        while (true) {
            Scanner input = new Scanner(System.in);
            String potentialPolyndrome = input.nextLine();

            try {
                int potentialNumber = Integer.parseInt(potentialPolyndrome);
            } catch (NumberFormatException e) {
                System.out.println("введено не число");
                continue;
            }
            if (potentialPolyndrome.length() > 9) {
                System.out.println("число больше возможной длинны");
                continue;
            }
            System.out.println("potential polyndrome " + potentialPolyndrome);
            String revercedpossiblePolyndrome = new StringBuilder(potentialPolyndrome).reverse().toString();
            System.out.println("mirrored possible polyndrome " + revercedpossiblePolyndrome);
            System.out.println(potentialPolyndrome.equals(revercedpossiblePolyndrome));

        }
    }
}
