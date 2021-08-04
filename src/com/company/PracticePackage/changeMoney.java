package com.company.PracticePackage;

//Задание 3.4
//        Для пересчета суммы в одной валюте - в сумму в другой валюте (например, между суммой в рублях и этой же суммой, но в евро) используется так называемый «банковский курс»: числовой коэффициент,
//        показывающий, чему равна единица одной валюты в единицах другой.
//        Напишите класс, который принимает с клавиатуры два числа: первое -
//        сумму в одной валюте (например, в долларах), и второе - «банковский
//        курс». Класс должен подсчитать и вывести на экран сумму во второй
//        валюте.
// процесс
import java.util.Scanner;

public class changeMoney {
    static Scanner money = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите сумму");
        double summ = money.nextDouble();
        System.out.println("Введите курс валют");
        double factCurse = money.nextDouble();


        double resultSumm = summ * factCurse;
        System.out.println("Сумма в конвертированной валюте:" + resultSumm);



//                System.out.println("Введите актуальный курс");
//        double bankCourse = money.nextDouble();
    }
}
