package com.company.Section4;

// Есть стринга с значениями. выводить только лишь уникальные

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class sortUniniqueValues {
    static String str = "A A B B C";  //объявление стринги. статическая т.к.если убрать статик, то ИДЕ будет ругаться

    public static void main(String[] args) {
        Set<String> typ = new HashSet<>();    //интерфейс сет, в который будет передаваться стринга. имплементируем хешсет
        typ.addAll(Arrays.asList(str.split(" ")));   //вызываем эту коллекцию (сет). и говорим "добавить все". Еррей - статический класс, и хотим записать как лист (вызываем наш массив) и убираем пробелы момандой сплит, записывая регулярку в виде пробела
        System.out.println(typ);
    }

}
