package com.company.Section6_Simple_If;
//          task 6.8
//          Напишите класс, который принимает с клавиатуры два целых числа и,
//        если первое больше второго, выводит на экран их сумму, если же наоборот -
//        выводит на экран их произведение. В случае же, если числа
//        одинаковы, программа выводит на экран сообщение Числа равны.

import java.util.Scanner;

public class task8 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите первое число");
        int a = reader.nextInt();
        System.out.println("Введите второе число");
        int b = reader.nextInt();
        if (a == b) {
            System.out.println("Числа равны: " + "Первое число: " + a + ", " + "Второе число: " + b);
        } if (a > b) {
            int c = a + b;
            System.out.println("Первое число больше второго, сумма чисел: " + c);
        } if (a < b) {
            int c = a * b;
            System.out.println("Второе число больше первого, произведение чисел: " + c);
        }


    }
}
