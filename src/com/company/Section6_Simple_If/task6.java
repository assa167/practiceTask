package com.company.Section6_Simple_If;

//        task 6.6
//        Напишите класс, который принимает с клавиатуры целое число
//        и выводит на экран одно из следующих сообщений: Положительное, или
//        Отрицательное, или Ноль, - в зависимости от значения числа.

import java.util.Scanner;

public class task6 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите целое число ");
        int input = reader.nextInt();
        if (input == 0) {
            System.out.println("Значение: " + input);
        } if (input > 0 ) {
            System.out.println("Значение положительное: " + input);
        } if (input < 0) {
            System.out.println("Значение отрицательное: " + input);
        }
    }
}
