package com.company.PracticePackage;

//task  3.6
//Напишите класс, который принимает с клавиатуры целое число и вывоит на экран (в одной строке) три следующих за ним целых числа так,
//        чтобы разница между каждым числом и следующим за ним составляла 2.
//        Например: для введенного с клавиатуры числа 6 надо вывести на экран числа 8, 10, 12.

import java.util.Scanner;

public class nextNumber {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите число: ");
        int number = reader.nextInt();
        int resultNumber = number + 2;
        int resultNumberNext = resultNumber + 2;
        int resultNumberNextLast = resultNumberNext + 2;
        System.out.println(resultNumber + " " + resultNumberNext + " " + resultNumberNextLast);
    }

}
