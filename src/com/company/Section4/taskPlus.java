package com.company.Section4;

// Task 4,7
//Напишите класс, который принимает с клавиатуры целое положительное двузначное число. Затем следует построить новое значение,
// составленное из цифр числа, введенного с клавиатуры, но в обратном
// порядке. После этого новое значение следует увеличить на 8, и окончательный результат вывести на экран.
// То есть для числа 37 следует построить число 73 и вывести на экран 81.

import java.util.Scanner;

public class taskPlus {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите 2-х значное число");
        int x, x1, x2, x3, x4;
        x = reader.nextInt();
        x1 = x%10;
        x2 = x/10;
        x3 = x1*10 + x2;
        x4 = x3 + 8;
        System.out.println(x4);

    }
}
