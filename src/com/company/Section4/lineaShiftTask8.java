package com.company.Section4;

//      Task 4.25
//        Назовем «обменом» операцию, при которой два числа «обмениваются»
//        своими правыми цифрами.
//        Напишите класс, который принимает с клавиатуры два положительных
//        числа и совершает над ними операцию "обмена". Числа могут быть разной длины.

import java.util.Scanner;

public class lineaShiftTask8 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите число");
        int a, a1, b, b1;
        a = reader.nextInt();
        b = reader.nextInt();
        a1 = a%10;
        a = a/10;
        System.out.println(a1);
        System.out.println(a);
        b1 = b%10;
        b = b/10;
        a = a * 10 + b1;
        b = b * 10 + a1;
        System.out.println(a + " " + b);
    }

}
