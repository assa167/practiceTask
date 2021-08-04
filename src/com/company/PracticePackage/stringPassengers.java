package com.company.PracticePackage;

// Task 2.36
//Напишите класс, который принимает с клавиатуры фамилию пассажира и город, в который он вылетает.
//        Класс должен построить строковую переменную, которая будет содержать сообщение Пассажир
//        ... въmетает в ... , в котором вместо многоточий будут фигурировать фамилия пассажира и
//        название города, в который он вылетает. Эту строковую переменную следует вывести на экран

//не начинал делать!

import java.util.Scanner;

public class stringPassengers {

    static Scanner reader  = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите вашу фамилию");
        String name = reader.next();
        System.out.println("Введите название города назначения");
        String cityName = reader.next();
        System.out.println("Пассажир " + name + " вылетает в " + cityName);

    }
}
