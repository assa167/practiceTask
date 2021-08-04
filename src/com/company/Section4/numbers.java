package com.company.Section4;

//Задание 4.1
//        Напишите класс, который принимает с клавиатуры целое положительное
//        двузначное число и выводит на экран его цифры, разделенные знаком «пробел».

import java.util.Scanner;

public class numbers {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите число");
        int high = reader.hasNext() ? reader.nextInt() : 0;
        System.out.println(high / 10+ " " + high % 10);
    }


}
