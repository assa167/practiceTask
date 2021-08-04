package com.company.Section4;

//        Task 4.22
//        Назовем «сдвигом числа вправо по кругу» операцию, при которой все
//        цифры числа сдвигаются вправо, а число единиц (последняя цифра)
//        перемещается в старший разряд числа (первая цифра).
//        Например, из числа 1234 получается число 4123.
//        Напишите класс, который принимает с клавиатуры трехзначное число
//        и строит новое число, полученное «сдвигом вправо по кругу».

import java.util.Scanner;

public class lineaShiftTask5 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите 3-х значное число");
        int x, x1, x2, x3, buffer1, buffer2, buffer3;
        x = reader.nextInt();
        x1 = x/100;
        x2 = (x%100)/10;
        x3 = x%10;
        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);
        System.out.println("---------------");
        buffer1 = x3;
        buffer2 = x2;
        buffer3 = x1;
        System.out.println(buffer1);
        System.out.println(buffer2);
        System.out.println(buffer3);
        System.out.println(buffer1 + "" + buffer2 + "" + buffer3);
    }
}

