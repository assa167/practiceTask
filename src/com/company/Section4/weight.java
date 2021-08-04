package com.company.Section4;

// Task 4.9
//Назовем «весом числа>> сумму его цифр.
//Напишите класс, который принимает с клавиатуры число (двузначное)
//и выводит на экран его «вес».

import java.util.Scanner;

public class weight {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите 2-х значное число");
        int a, b, c, result, run;
        a = reader.nextInt();
        b = a/10;
        c = a%10;
        result = b*10 + c;
        run = result - c;
        System.out.println(run + "+" + c);

    }
}
