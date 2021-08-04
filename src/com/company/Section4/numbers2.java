package com.company.Section4;

//Задание 4.2
//        Напишите класс, который принимает с клавиатуры целое положительное трехзначное число и выводит на экран его цифры, разделенные
//        знаком «пробел».


import java.util.Scanner;

public class numbers2 {
     static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Введите 3-х значное число");
        String number = reader.next();
        char[] strToArray = number.toCharArray();
        for (int a = 0; a < strToArray.length; a++) {
            System.out.print(strToArray[a] + " ");
        }










//        int index = 0;
//        int[] per = new int[array.length];
//        for (char a: array) {
//            if (a != ' ') {
//                per[++index] = a;
//            }
//            System.out.println(per);
//        }

    }

}
