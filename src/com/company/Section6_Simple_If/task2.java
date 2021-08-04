package com.company.Section6_Simple_If;
//      task 6.2
//Дан класс (программа):
//import java.util.;
//class IfSample2
//{
//    static Scanner reader = new Scanner(System.in);
//}
//Простой if (без eLse и с единственным условием)
//        pubic static void main(String args)
//        {
//        }
//        double num;
//        System.out.println ("enter number");
//        num = input.nextDouЬle();
//        if (num>O) System.out.println ("Положительное
//        число");
//        System.out.println ("Завершено");
//        31
//        1. Что будет выведено на экран, если с клавиатуры введено значение 8?
//        2. Что будет выведено на экран, если с клавиатуры введено значение -9?
//        3. Что будет выведено на экран, если с клавиатуры введено значение О?
//        4. Приведите пример значения, которое надо ввести с клавиатуры,
//        чтобы на экран выводилось сообщение Положительное число.
//        5. Приведите пример значения, которое надо ввести с клавиатуры,
//        чтобы на экран не выводилось сообщение Положительное число.
//        6. Почему на экран всегда выводится сообщение Завершено?
//        7. Как надо изменить код класса, чтобы сообщение Завершено выводилось на экран только вместе с сообщением Положительное число?


import java.util.Scanner;

public class task2 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        double num;
        System.out.println("Enter number");
        num =  reader.nextDouble();
        if (num > 0){
            System.out.println("Положительное число");
            System.out.println("Завершено");
        } else {
            System.out.println("Отрицательное число");
        }

    }
}
