package com.company.Section4;


import java.util.Scanner;

public class shiftTask2 {
    public  static Scanner reader  = new Scanner(System.in);
    public  static void main (String[] args) {
    int x, x1, x2, x3, x4, result;
        System.out.println("Введите 4-х значное число");
        x = reader.nextInt();
        x1 = x/1000;
        x2 = (x/100)%10;
        x3 = (x%100)/10;
        x4 = x%10;
        System.out.println(x4 + "" + x3 + "" + x2 + "" + x1);
    }

}
