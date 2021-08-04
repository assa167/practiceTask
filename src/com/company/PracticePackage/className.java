package com.company.PracticePackage;

//Task 2.37
//        Напишите класс, который принимает с клавиатуры имя и фамилию
//        ученика.
//        Класс должен вывести на экран в одной строке сначала фамилию, а
//        после нее имя ученика, а во второй строке - сначала имя, а после
//        него - фамилию ученика.

import java.util.Scanner;

public class className {

    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите имя ученика");
        String name = reader.next();
        System.out.println("Введите фамилию ученика");
        String surname = reader.next();
        System.out.println( name +  " " + surname);
        System.out.println(surname + " " + name);
    }
}
