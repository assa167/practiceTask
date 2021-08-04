package com.company.Section4;
//        Задание 4.4
//        Напишите класс, который принимает с клавиатуры целое положительное трехзначное число и выводит на экран его цифры, разделенные
//        знаком «пробел», но в обратном порядке. То есть для числа 415 будет
//        выведено на экран 5 1 4.


import java.util.Scanner;

public class invertSecondExample {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите число");
        int x, x1, x2, x3;
        x = reader.nextInt();
        x1 = x/100;
        x2 = (x%100)/10;
        x3 = x%10;
        System.out.println(x3 + " " + x2 + " " + x1);

    }
}
