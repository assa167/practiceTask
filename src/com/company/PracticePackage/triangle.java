package com.company.PracticePackage;

// Task 2.33
//Напишите класс, который принимает с клавиатуры три числа:
// значения оснований трапеции и ее высоту.
// Класс должен подсчитать и вывести на экран площадь этой трапеции.


import java.util.Scanner;

public class triangle {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите первую высоту трапеции");
        double firstSide = reader.nextInt();
        System.out.println("Введите вторую сторону трапеции");
        double secondSide = reader.nextInt();
        System.out.println("Введите высоту трапеции");
        double high = reader.nextInt();
        double Area = 0.5 * (firstSide + secondSide) * high;
        System.out.println("Площадь трапеции: " + Area);

    }
}
