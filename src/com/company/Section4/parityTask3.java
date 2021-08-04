package com.company.Section4;

// Task 4.15
//Напишите класс, который принимает с клавиатуры положительное
//        четырехзначное число, а затем вычисляет и выводит на экран его «степень четности».

import java.util.Scanner;

public class parityTask3 {
   static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("ВВедите 4-х значное число");
        int a, b, c, d ,f , chet = 0;
        a = reader.nextInt();
        b = a/1000;
        c = (a%100)/10;
        d = (a/100)%10;
        f = a%10;
        if (b%2 == 0)
            chet++;
        if (c%2 == 0)
            chet++;
        if (d%2 == 0)
            chet++;
        if (f%2 == 0)
            chet++;
        System.out.println(a);
        System.out.println(b + " " + c + " " + d + " " + f);
        System.out.println("Степень четности числа: " + chet);
    }

}
