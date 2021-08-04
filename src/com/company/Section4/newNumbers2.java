package com.company.Section4;

//Задание 4.6
//        Напишите класс, который принимает с клавиатуры целое
//        положительное трехзначное число и выводит его на экран
//        в «полном виде»: например, для числа 364 это будет выглядеть как 300+60+4.

import java.util.Scanner;

public class newNumbers2 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите 3-х значное число");
        int x, x1, x2, x3, x4, x5, x6, x7;
        x = reader.nextInt();
        x1 = x/100;
        x2 =(x%100)/10;
        x3 = x%10;
        x4 = x - x3;
        x5 = x - x4;
        x6 = x4 - (x2 * 10);
        x7 = x4 - x6;
//        System.out.println(x4);
//        System.out.println(x5);
//        System.out.println(x6);
//        System.out.println(x7);
        System.out.println(x6 + "+" + x7 + "+" + x5);
        //процесс
    }

}
