package com.company.Section6_Simple_If;
// task 6.7
//Напишите класс, который принимает с клавиатуры целое положительное число и,
// если оно как минимум трехзначное и положительное,
// уменьшает его на 1.


import java.util.Scanner;

public class task7 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите число");
        String result = reader.next();
        try {
            String cutRes = result.substring(0, 3);
            int too = Integer.parseInt(cutRes);
            too--;
            System.out.println(too);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Введите 3-х значное число");
        }
    }
}