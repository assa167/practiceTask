package com.company.Section6_Simple_If;
//        task 6.4
//        Напишите класс, который принимает с клавиатуры целое число и, если
//        оно положительное, увеличивает его вдвое. Класс должен выводить на
//        экран новое значение.

import java.util.Scanner;

public class task4 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите число");
        int numberA = reader.nextInt();
        if (numberA >= 0) {
            int numberB = numberA * 2;
            System.out.println("Увеличинное в 2 раза число: " + numberB);
        } else {
            System.out.println("Число меньше 0");
        }

    }
}
