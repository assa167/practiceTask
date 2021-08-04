package com.company.Section4;

//Напишите класс, который выполняет «линейный сдвиг влево» для четырехзначного числа.

import java.util.Scanner;

public class lineaShiftTask2 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите 4-х значное число");
        int x, x1, x2, x3, x4, buffer1, buffer2, buffer3, buffer4;
        x = reader.nextInt();
        x1 = x/1000;
        x2 = (x/100)%10;
        x3 = (x%100)/10;
        x4 = x%10;
        buffer1 = x2;
        buffer2 = x3;
        buffer3 = x4;
        buffer4 = 0;
        System.out.println(buffer1 + "" + buffer2 + "" + buffer3 + ""  + buffer4);
    }
}
