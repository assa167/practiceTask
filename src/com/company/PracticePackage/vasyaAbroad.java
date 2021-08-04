package com.company.PracticePackage;

//Задание 3.10
//        Подрабатывая в течение года, Вася собрал себе определенную сумму на
//        поездку за границу, а родители добавили ему от себя еще некоторую
//        сумму.
//        Напишите класс, который принимает с клавиатуры три значения: первое - сумма в рублях, заработанная Васей, второе - сумма в рублях,
//        которую ему дали родители, третье - курс рубля по отношению к евро.
//        Класс должен подсчитать и вывести на экран сумму в евро, которая
//        имеется у Васи для поездки за границу.

import java.util.Scanner;

public class vasyaAbroad {

    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите сумму котороую заработал Вася в рублях");
        double vasyaSallary = reader.nextDouble();
        System.out.println("Введите сумму, которую Васе дали родители в рублях");
        double parentsMoneyGiveVasyaForTheRest = reader.nextDouble();
        System.out.println("Курс рубля по отношению к Евро");
        double curs = reader.nextDouble();
        double cursRubtoEuro = 65 / curs;
        double sum = (vasyaSallary + parentsMoneyGiveVasyaForTheRest) / cursRubtoEuro;
        System.out.println("Сумма Васи для отдыха за границей: " + sum);

        //продолжить раздел 4 . первая задача

    }

}
