package com.company.PracticePackage;

//Задание 3.2
//        Во многих странах для измерения небольших размеров используется
//        не только единица длины «сантиметр», но и такая единица, как
//        «дюйм>> (1дюйм=2.54 сантиметра).
//        Напишите класс, который принимает с клавиатуры значение, равное
//        размеру в сантиметрах, и затем подсчитывает и выводит на экран это
//        же значение, но в дюймах.

import java.util.Scanner;

public class length {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите длинну в сантиметрах");
        double cm = reader.nextDouble();
        double inch = cm / 2.54;
        System.out.println("Значение длинны в дюймах" + inch);
    }
}
