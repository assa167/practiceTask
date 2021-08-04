package com.company.Section4;

// task 4.14
//Напишите класс, который принимает с клавиатуры положительное
//        трехзначное число, а затем вычисляет и выводит на экран его «степень
//        четности».

import java.util.Scanner;

public class parityTask2 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ввести 3-х значное число");
        int a, b, c, d, result, u = 0;
        a = reader.nextInt();
        b = a/100;
        c = (a/100)%10;
        d = a%10;
        if (b%2 == 0)
            u++;
        if (c%2 == 0)
            u++;
        if (d%2 == 0)
            u++;
        System.out.println(u);
    }
}
