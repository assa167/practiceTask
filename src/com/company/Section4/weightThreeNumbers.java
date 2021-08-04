package com.company.Section4;

// Task 4.10
//Назовем «весом числа>> сумму· его цифр.
//        Напишите класс, который принимает с клавиатуры число (трехзначное)
//        и выводит на экран его «вес».

import java.util.Scanner;

public class weightThreeNumbers {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ввести 3-х значное число");
        int a, b, c, d, result, result2;
        a = reader.nextInt();
        b = a/100;
        c = (a%100)/10;
        d = a%10;
        result = a + b + c;
        System.out.println(result);
    }
}
