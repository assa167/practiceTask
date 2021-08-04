package com.company.PracticePackage;

//Задание 3.9
//        Компания по продаже минеральной воды проводит конкурс «Балл под
//        крышкой»: на внутренней стороне пробок, которыми закрыты бутылки, выпускаемые компанией, напечатаны призовые баллы. Есть пробки, «равные» 10 баллам, есть - 100, есть - 1000.
//        Напишите класс, который принимает с клавиатуры три числа, означающие количество пробок каждого типа, собранных Васей, и выводит
//        на экран общее количество баллов, которые Вася получил.


import java.util.Scanner;

public class VasyaVictorina {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите количество 10");
        int firstCase = reader.nextInt();
        System.out.println("Введите 100");
        int secondCase = reader.nextInt();
        System.out.println("Введите количество 1000");
        int thirdCase = reader.nextInt();
        int result = firstCase * 10 + secondCase * 100 + thirdCase * 1000;
        System.out.println("тоговая сумма балоов: " + result);

    }


}
