package com.company.Section4;

//Task 4.24
//        Назовем «обменом» операцию, при которой два числа «обмениваются»
//        своими правыми цифрами.
//        Напишите класс, который принимает с клавиатуры два трехзначных
//        положительных числа и совершает над ними операцию «обмена».


import java.util.Scanner;

public class lineaShiftTask7 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите первое 3-х значное число");
        int x, x1, x2, x3, y, y1, y2, y3, firstNumber1, firstNumber2, firstNumber3, secondNumber1, secondNumber2, secondNumber3;
        x = reader.nextInt();
        System.out.println("Введите второе 3-х значное число");
        y = reader.nextInt();
        x1 = x/100;
        x2 = (x%100)/10;
        x3 = x%10;
        y1 = y/100;
        y2 = (y%100)/10;
        y3 = y%10;
        firstNumber1 = y1;
        firstNumber2 = x2;
        firstNumber3 = y3;
        System.out.println("Заменнные числа первого числа");
        System.out.println(firstNumber1 + "" + firstNumber2 + "" + firstNumber3);
        secondNumber1 = x1;
        secondNumber2 = y2;
        secondNumber3 = x3;
        System.out.println("Замененные второго числа");
        System.out.println(secondNumber1 + "" + secondNumber2 + secondNumber3);


    }
}
