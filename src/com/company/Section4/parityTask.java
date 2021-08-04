package com.company.Section4;

//Задание 4.13
//        Назовем «степенью четности» числа количество четных цифр в нем.
//        Например, для числа 4612 степень четности равна 3
//        (в его составе три четных цифры - 4, 6 и 2).
//        24 Раздел 4
//        Напишите класс, который принимает с клавиатуры положительное
//        двузначное число, а затем вычисляет и выводит на экран его «степень
//        четности».

import java.util.Scanner;

public class parityTask {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите 2-х значное число");
        int a, b, c, d, res = 0;
        a = reader.nextInt();
        b = a/10;
        c = a%10;
        if (b%2 == 0)
            res++;
        if (c%2  == 0)
            res++;
        System.out.println(res);
        //done
    }
}
