package com.company.Section4;

import java.util.Scanner;

public class example {
    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {

        String str = read.next();
        char[] strToArray = str.toCharArray();
        for (int i = 0; i < strToArray.length; i++) {
            System.out.print(strToArray[i] + " ");
        }

    }
}