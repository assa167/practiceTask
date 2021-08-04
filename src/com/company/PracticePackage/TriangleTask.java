package com.company.PracticePackage;

//Задание 3.5
//        Напишите класс, который принимает с клавиатуры три числа: длины
//        двух катетов и гипотенузы прямоугольного треугольника, и выводит
//        на экран площадь и периметр этого треугольника.
//        При решении следует предусмотреть возможность того, что размеры
//        сторон треугольника не выражаются целыми числами.

import java.util.Scanner;

public class TriangleTask {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите первый катет");
        double firstCatet = reader.nextDouble();
        System.out.println("Введите второй катет");
        double secondCatet = reader.nextDouble();
        System.out.println("Введите гипотенузу");
        double gipotenuza = reader.nextDouble();
        double s = 0.5 * firstCatet * secondCatet;
        System.out.println("Площадь равнобедренного треугольника: " + s);
        double p = firstCatet + secondCatet + gipotenuza;
        System.out.println("Периметр равнобедренного треугольника: " + p);

    }

}
