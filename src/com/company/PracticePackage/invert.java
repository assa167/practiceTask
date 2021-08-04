package com.company.PracticePackage;

import java.util.Scanner;

public class invert {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите число");
        int numberPossitive = reader.nextInt();
        int numberInvert = -numberPossitive;
        System.out.println("Отрицательное число: " + numberInvert);

    }

}
