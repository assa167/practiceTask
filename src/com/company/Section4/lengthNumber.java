package com.company.Section4;

//Task 4.11
//Назовем «длиной двузначного числа» разницу между числом десятков
//        (первая цифра) и числом единиц (вторая цифра).
//        Напишите класс, который принимает с клавиатуры двузначное число и
//        выводит на экран его «длину».


import java.util.Scanner;

public class lengthNumber {
    static Scanner  reader =  new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите  2-х значное число");
        int firstNumber, secondNumber, thirdNumber, resultNumber;
        firstNumber = reader.nextInt();
        secondNumber = firstNumber/10;
        thirdNumber = firstNumber%10;
        resultNumber = secondNumber - thirdNumber;
        System.out.println(firstNumber);
        System.out.println(secondNumber);
        System.out.println(thirdNumber);
        System.out.println("Разница между числом десятков и числом единиц:" +resultNumber);
    }
}
