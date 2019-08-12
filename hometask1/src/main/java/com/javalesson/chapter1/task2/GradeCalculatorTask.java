package com.javalesson.chapter1.task2;

/**
 * Напишите программу, которая принимает заранее неизвестное количество оценок
 * считает общую сумму оценок и среднее значение.
 * Оценки должны быть получены с консоли и от запуска к запуску их количество может меняться.
 * Для этого вам понадобится один из циклических операторов с заранее не известным количеством циклов.
 * Вспомните, какие бывают циклические операторы и в чем особенность каждого из них.
 * Так же вам понадобится определенное значение, которое будет обозначать завершение обработки
 * входящих данных и переход к вычислениям. Так как оценки не могут быть отрицательными,
 * можно использовать отрицательное целое значение (например -1 или -5) как указатель выхода из цикла.
 *
 * Для выполнения задания Вам понадобится класс Scanner.
 * Создайте объект класса <code> Scanner scanner = new Scanner(System.in);</code>
 * Используя методы этого класса, Вы можете прочитать с консоли данные разного типа.
 * <code>
 *     scanner.nextInt();
 *     scanner.nextDouble();
 *     scanner.nextLine();
 *     scanner.nextFloat();
 *     scanner.next();
 * </code>
 *
 * После выполнения задания сверьтесь с тем что написано в  GradeCalculatorSolution.java.
 *
 * Подумайте какие есть недостатки у решения в классе GradeCalculatorSolution.
 *
 * Вам нужно предложить 2 улучшения. По желанию можно реализовать их самостоятельно (не обязательно).
 * Подсказка: одно из них реализовать очень просто.
 * Для второго Вам могут понадобиться знания из раздела Обработка исключений в Java.
 **/
import java.util.Scanner;
public class GradeCalculatorTask {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.println("for a pr from intellij idea!");
        int total = 0;
        int gradeCounter = 0;
        Double averageGrade = 0.;
        int maximumGrade = 5;
        int minimumGrade = 0;
//        String outputString = "Сумма оценок = %d: \n" +
//                                " Средняя оценка = %f:";

        while(input.hasNextInt()){
            int currentGrade = input.nextInt();
            if(!(currentGrade > minimumGrade && currentGrade <= maximumGrade)){
                System.out.println("Некорpектная оценка");
                String outputString = String.format("Сумма оценок = %d: \n" +
                        " Средняя оценка = %f:", total, averageGrade);
                System.out.println(outputString);
                continue;
            }
            total = total + currentGrade;
            gradeCounter++;
            averageGrade = (double) total/ gradeCounter;
            String outputString = String.format("Сумма оценок = %d: \n" +
                    " Средняя оценка = %f:", total, averageGrade);
            System.out.println(outputString);
        }

    }
}
