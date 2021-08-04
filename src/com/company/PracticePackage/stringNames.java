package com.company.PracticePackage;

//Task 2.35
//        Напишите класс, который принимает с клавиатуры два строковых значения: ваше имя и вашу фамилию.
//        Класс должен вывести на экран сообщение Вас зовут, а рядом с ним
//        (через пробел) ваше имя и фамилию, введенные с клавиатуры.

import java.util.Scanner;

public class stringNames {

    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите Ваше имя");
        String name = reader.next();
        System.out.println("Введите Вашу фамилию");
        String surname = reader.next();

        System.out.println("Вас зовут: " + name + " " + surname );
    }
}
