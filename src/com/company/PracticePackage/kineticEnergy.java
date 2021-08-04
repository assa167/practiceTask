package com.company.PracticePackage;

// Task 2.31
//        Кинетическая энергия тела подсчитывается как половина произведения массы тела на квадрат скорости тела.
//        Напишите класс, который принимает с клавиатуры два числа, первое
//        из которых - масса тела, а второе - его скорость.
//        Класс должен подсчитать и вывести на экран значение кинетической
//        энергии тела.


import java.util.Scanner;

public class kineticEnergy {

    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите значение массы");
        int massa = reader.nextInt();
        System.out.println("Введите значение скорости");
        int speed = reader.nextInt();
        int kineticEnergy = (massa * (speed * speed))/2;
        System.out.println("Кинетическая энергия: " + kineticEnergy);
    }

}
