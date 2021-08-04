package com.company.Section4;

//Задание 4.3
//        Напишите класс, который принимает с клавиатуры целое положительное двузначное число и выводит на экран его цифры, разделенные
//        знаком «пробел», но в обратном порядке. То есть для числа 45 будет
//        выведено на экран 5 4.

import java.util.Scanner;

public class invertExample {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите число");
        int chislo = reader.hasNext() ? reader.nextInt() : 0;
        System.out.println(chislo % 10 + " " + chislo / 10);

    }

}
