package com.company.Section4;

//Task 4.26
//Назовем «большим обменом» операцию, при которой два числа «обмениваются» своими левыми цифрами.
//        1. Напишите класс, который принимает с клавиатуры два трехзначных
//        положительных числа и совершает над ними операцию «обмена».
//        2. Возможно ли совершить операцию «большого обмена», если два
//        числа имеют разное количество цифр? Обоснуйте свой ответ.



import java.util.Scanner;

public class lineaShiftTask9 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите 3-х ");
        int a, a1,  b, b1, c, d;
        a = reader.nextInt();
        b = reader.nextInt();
        a1 = a%10;
        a = a/10;
        System.out.println(a1);
        System.out.println(a);
        b1 = b%10;
        b = b/10;
        System.out.println(b1);
        System.out.println(b);
        c = b * 10 + a1;
        d = a * 10 + b1;
        System.out.println(c + " " + d);
    }
}
