package com.company.PracticePackage;

//Задание 3.7
//        Напишите класс, который принимает с клавиатуры целое число и выводит на экран три предыдущих ему целых числа, причем каждое - в
//        отдельной строке.


import java.util.Scanner;

public class previousNumber {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите число");
        int number = reader.nextInt();
        int number2 = number - 1;
        int number3 = number2 - 1;
        int number4 = number3 - 1;
        System.out.println(number2);
        System.out.println(number3);
        System.out.println(number4);

    }


}
