package com.company.Section5_LogicOperators;

//        task 5.6
//        Перед вами фрагмент программы:
//        Выберите значение для ввода в переменную а и переменную Ь, так,
//        чтобы было выведено сообщение FALSE. Объясните свой выбор.


import java.util.Scanner;

public class task6 {
    static Scanner in  = new Scanner(System.in);

    public static void main(String[] args) {
        int  a, b;
        a = in.nextInt();
        b = in.nextInt();
        if ((a < b) || (a < 100))
            System.out.println("TRUE");
        else
            System.out.println("FALSE");
    }
}
