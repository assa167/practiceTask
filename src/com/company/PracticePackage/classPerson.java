package com.company.PracticePackage;

//Задание 2.39
//        Напишите класс, который принимает с клавиатуры фамилию, имя и
//        отчество, а затем строит строковое значение по следующему правилу:
//        первая буква имени, точка, первая буква отчества, точка, пробел, фамилия. Затем это строковое значение следует вывести на экран.
//        Например, если с клавиатуры были введены значения
//        Иван
//        Иванович
//        Иванов,
//        то на экран следует вывести значение И. И. Иванов.

import java.util.Scanner;

public class classPerson {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите имя");
        String name = reader.next();
        System.out.println("Введите фамилию");
        String sername =  reader.next();
        System.out.println("Введите отчество");
        String fullName = reader.next();
        String fullResult = name.charAt(0) + "." + fullName.charAt(0) + "." + sername;
        System.out.println(fullResult);

    }
}
