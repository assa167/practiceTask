package com.company.Section4;

// Task 4.8
//Напишите класс, который принимает с клавиатуры целое положительное трехзначное число.
// Затем следует построить новое значение, составленное из цифр числа,
// введенного с клавиатуры, но в обратном
// порядке. После этого новое значение следует уменьшить на 20, и
// окончательный результат вывести на экран. То есть для числа 327 следует
// построить число 723 и вывести на экран 703.

import java.util.Scanner;

public class taskPlus2 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите 3-х значное число");
        int number, x, y, z, result, ret;
        number = reader.nextInt();
        x = number/100;
        y = (number%100)/10;
        z = number%10;
        result = (z*100) + (y*10) + x;
        ret = result - 20;
        System.out.println(z + " " + y + " " + x);
        System.out.println(ret);
    }

}
