package com.company.Section4;

//        Task 4.18
//        Назовем «линейным сдвигом числа влево» операцию, при которой его
//        цифры перемещаются на одну позицию влево (единицы - на место
//        десятков, десятки - на место сотен, сотни - на место тысяч и так далее)
//        - при этом первая цифра удаляется из числа, а на место единиц
//        записывается ноль.
//        Например, из числа 1234 после такой операции получается число 2340.
//        Напишите класс, который принимает с клавиатуры трехзначное число
//        и строит новое число, полученное «линейным сдвигом влево».

import java.util.Scanner;

public class lineaShiftTask {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите 3-х значное число");
        int x, x1, x2, x3, buffer1, buffer2, buffer3;
        x = reader.nextInt();
        x1 = x/100;
        x2 = (x%100)/10;
        x3 = x%10;
        buffer1 = x2;
        buffer2 = x3;
        buffer3 = 0;
        System.out.println(buffer1 + "" + buffer2 + "" + buffer3);
    }
}
