package com.company.Section6_Simple_If;
//task 6.1
//Дан класс (программа):
//import java.util.;
//class IfSamplel
//{
//}
//    static Scanner reader = new Scanner(System.in);
//public static void main(String[) args)
//        {
//        }
//        int х = reader.nextlnt();
//        int y=reader.nextlnt();
//        if (х <у) System.out.println ("х меньше у");
//        if (х ==у) System.out.println ("х теперь равна у");
//        if (х >у) System.out.println ("х теперь больше у");
//        1. Что будет выведено на экран, если с клавиатуры введены значения 5 и 9?
//        2. Что будет выведено на экран, если с клавиатуры введены значения 9 и 9?
//        3. Что будет выведено на экран, если с клавиатуры введены значения 9 и 5?
//        4. Приведите пример вводимых с клавиатуры данных, для которых
//        на экран будет выведено сообщение х меньше у.
//        5. Приведите пример вводимых с клавиатуры данных, для которых
//        на экран будет выведено сообщение х теперь больше у.
//        6. Приведите пример вводимых с клавиатуры данных, для которых
//        на экран будет выведено сообщение х теперь меньше у.


import java.util.Scanner;

public class task1 {
    static Scanner reader  = new Scanner(System.in);

    public static void main(String[] args) {
        int x = reader.nextInt();
        int y = reader.nextInt();
        if (x < y) System.out.println("х меньше y");
        if (x == y) System.out.println("x теперь равен y");
        if (x > y) System.out.println("x теперь больше у");
    }
}
