package com.company.Section4;

//        Task 4.20
//        Назовем «сдвигом числа влево по кругу» операцию, при которой его
//        цифры перемещаются на одну позицию влево (единицы - на место
//        десятков, десятки - на место сотен, сотни - на место тысяч и так далее)
//        - при этом первая цифра перемещается на место единиц.
//        Например, из числа 1234 получается число 2341.
//        Напишите класс, который принимает с клавиатуры трехзначное число
//        и строит новое число, полученное «сдвигом влево по кругу».

import java.util.Scanner;

public class lineaShiftTask3 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите 4-х значное число");
        int x, x1, x2, x3, buffer1, buffer2, buffer3;
        x = reader.nextInt();
        x1 = x/1000;
        x2 = (x%100)/10;
        x3 = x%10;
        buffer1 = x2;
        buffer2 = x3;
        buffer3 = x1;
        System.out.println(buffer1 + "" + buffer2 + "" + buffer3);
    }
}
