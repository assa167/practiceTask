package com.company.Section6_Simple_If;

//      task 6.5
//        Напишите класс, который принимает с клавиатуры целое число и, если
//        оно положительное, увеличивает его вдвое. Класс должен выводить на
//        экран новое значение.


import java.util.Scanner;

public class task5 {
    static Scanner reader  = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите число");
        int input = reader.nextInt();
        if (input == 0) {
            System.out.println("Число равно 0");
        } if (input > 0) {
            System.out.println("Число больше 0");
        } if (input < 0){
            System.out.println("Число меньше 0");
        }
    }
}
