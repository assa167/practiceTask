package com.company.PracticePackage;

//Задание 2.38
//        Напишите класс, который принимает с клавиатуры фамилию, имя и
//        отчество, а затем выводит на экран инициалы (без пробела между
//        инициалами).

import java.util.Scanner;

public class surnameName {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите Вашу фамилию");
        String surname = reader.next();
        System.out.println("Введите Ваше имя");
        String name = reader.next();
        System.out.println("Введите Ваше отчество");
        String secondName = reader.next();
        String result = surname.charAt(0) + "" + name.charAt(0) + ""  + secondName.charAt(0);
        System.out.println(result);

        //не решил!!!
    }
}
