package com.company.Section5_LogicOperators;

//task 5.4
//        Дано логическое выражение:
//        (z>x)ll(x<O)&&(z-y>9)
//        Чему равно значение этого выражения для следующих значений переменных:
//        x=-2;y=5;z=13?


public class task4 {
    public static void main(String[] args) {
        int x = -2;
        int y = 5;
        int z = 13;
        if (((z>x)||(x<0))&&(z-y>6))
        System.out.println("Это правда");

    }
}
