package com.company.Section4;

// task 4.16
//Назовем «перестановкой» операцию над числом, при которой его
// первая и последняя цифры меняются местами. Например, из числа 1234
//        получается число 4231. Напишите программу, которая принимает с
//        клавиатуры трехзначное число и строит из него новое число методом
//        «перестановки».


import java.util.Scanner;

public class shiftTask {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("ВВедите 3-х значное число");
        int x, x1, x2, x3, result;
        x = reader.nextInt();
        x1 = x/100;
        x2 = (x%100)/10;
        x3 = x%10;
        System.out.println(x3 + "" + x2 + "" + x1);
    }
}
