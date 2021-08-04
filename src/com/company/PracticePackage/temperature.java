package com.company.PracticePackage;

//Задание 3.1
//        Связь между температурой по шкале Цельсия и температурой по шкале Фаренгейта выражается формулой: C=S(F-32)/9, где С - температура
//        по шкале Цельсия, F - температура по шкале Фаренгейта.
//        Напишите класс, который принимает с клавиатуры температуру по
//        шкале Фаренгейта, а затем выводит на экран эту же температуру, но по
//        шкале Цельсия.

import java.util.Scanner;

public class temperature {

    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите температуру в Фаренгейте");
        int farengeit = reader.nextInt();
        int celsia = (farengeit - 32) / 9;
        System.out.println("Температура в градусах:" + celsia);

    }
}
