package com.company.Section4;

//Задание 4.12
//        Назовем «длиной трехзначного числа» разницу между его
//        первой (число сотен) и последней (число единиц) цифрами, умноженную на его
//        среднюю (число десятков) цифру.
//        Напишите класс, который принимает с клавиатуры целое положительное
//        трехзначное число, вычисляет его «длину» и выводит результат на
//        экран.

import java.util.Scanner;

public class lengthNumber2 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите 3-х значное число");
        int a, b, c, d, result, resultFinal;
        a = reader.nextInt();
        b = a/100;
        c = (a%100)/10;
        d = a%10;
        result = b - d;
        resultFinal = result * c;
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(result);

    }
}
