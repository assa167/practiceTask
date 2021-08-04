package com.company.PracticePackage;

//Task 2.34
//Напишите класс, который сначала заносит в переменную строковое
//        значение Привет, а затем принимает с клавиатуры ваше имя.
//        Класс должен вывести на экран в одной строке сообщение, составленное из строкового значения Привет, знака «запятая» и вашего имени.

import java.util.Scanner;

public class stringTask {

    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите имя");
        String input = reader.next();
        System.out.println("Привет, " + input);
    }

}
