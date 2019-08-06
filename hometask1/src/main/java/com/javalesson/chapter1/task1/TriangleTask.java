package com.javalesson.chapter1.task1;
/**
 *  Напишите программу которая принимает 3 числовых значения и проверяет, могут ли они быть
 *  сторонами треугольника.
 *  Для ввода значений с консоли Вам понадобится класс Scanner.
 *  <code>Scanner scanner = new Scanner(System.in);</code>
 *  <code>scanner.nextInt();</code>
 */
import java.util.Scanner;
import java.util.ArrayList;
public class TriangleTask {

    public static void main(String[] args) {
        int SIGHTS_QUANTITY = 3;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> sights = new ArrayList<Double>();
        double biggest = -1;

        for(int i = 0; i < SIGHTS_QUANTITY; i++){
            System.out.println("enter sight "+ i);
            double sight = scanner.nextDouble();
            if (sight > biggest){
                biggest = sight;
            sights.add(sight);
            }
        }

        sights.remove(biggest);

        double notbiggest = 0;

        for (double sight : sights) {
            notbiggest = notbiggest + sight;
        };
        
        System.out.println(notbiggest >= biggest);
        }
    }