package com.company.Section4;

//      Task 4.23
//      Напишите класс, который выполняет «сдвиг вправо по кругу» для четырехзначного числа.

import java.util.Scanner;

public class lineaShiftTask6 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите 4-х значное число");
        int x, x1, x2, x3, x4, buffer1, buffer2, buffer3, buffer4;
        x = reader.nextInt();
        x1 = x/1000;
        x2 = (x%100)/10;
        x3 = (x/100)%10;
        x4 = x%10;
        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);
        System.out.println(x4);
        buffer1 = x4;
        buffer2 = x3;
        buffer3 = x2;
        buffer4 = x1;
        System.out.println(buffer1);
        System.out.println(buffer2);
        System.out.println(buffer3);
        System.out.println(buffer4);
        System.out.println(buffer1 + "" + buffer2 + "" + buffer3 + ""  + buffer4);
    }
}
