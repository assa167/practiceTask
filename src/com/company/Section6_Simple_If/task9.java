package com.company.Section6_Simple_If;
//      task 6.9
//        Трехзначное положительное число называется «четно-красивым», если
//        каждая из его цифр - четная. Напишите класс, который принимает с
//        клавиатуры трехзначное число и проверяет, является ли оно «четнокрасивым».
//        В соответствии с результатом проверки надо вывести на
//        экран соответствующее текстовое сообщение.
//        Обратите внимание: задание имеет решение с использованием одного
//        оператора if и без составного условия!


import java.util.Scanner;

public class task9 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите число");
        int a = reader.nextInt();
        int a1, a2, a3;
        a1 = a/100;
        a2 = (a%100)/10;
        a3 = a%10;
        System.out.println(a1 + " " + a2 + " " + a3);
        if (a1%2 == 0)
        {
            System.out.println(a1);
        } if (a2%2 == 0)
        {
            System.out.println(a2);
        } if (a3%2 == 0) {
            System.out.println(a3);
        }
        System.out.println(a1 + " " + a2 + " " + a3);
//        if (a1, a2, a3 == 0) {
//            System.out.println(a);
//        }

        //процесс
    }

}
