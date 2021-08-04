package com.company.Section4;

//Task 4.5
//        Напишите класс, который принимает с клавиатуры целое положительное
//        двузначное число и выводит его на экран в «полном виде»: например,
//        для числа 34 это будет выглядеть как 30+4.

import java.util.Scanner;

public class newNumber {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите число");

        int x, x1, x2, x3;
        x = reader.nextInt();
        x1 = x/10;
        x2 = x%10;
        x3 = x - x2;

        System.out.println(x3  + "+" +  x2);

    }
}
