package com.javarush.task.task09.task0910;

import java.util.ArrayList;

/* 
Исключение при работе с коллекциями List
*/

public class Solution {
    public static void main(String[] args) {

        try {
            ArrayList<String> list = new ArrayList<String>();
            String s = list.get(18);
        }

        catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException has been caught.");
        }
    }
}

/*
может пригодится кому
1. java.lang.ArithmeticException
Арифметическая ошибка, например, деление на ноль.
2	java.lang.ArrayIndexOutOfBoundsException
Индекс массива выходит за пределы.
3	java.lang.ArrayStoreException
Присвоение элементу массива несовместимого типа.
4	java.lang.ClassCastException
Недопустимое приведение типов.
5	java.lang.IllegalArgumentException
Недопустимый аргумент, используемый для вызова метода.
6	java.lang.IllegalMonitorStateException
Недопустимая работа монитора, например, ожидание разблокированного потока.
7	java.lang.IllegalStateException
Окружающая обстановка или приложение находится в неправильном состоянии.
8	java.lang.IllegalThreadStateException
Запрошенная операция несовместима с текущим состоянием потока.
9	java.lang.IndexOutOfBoundsException
Некоторый тип индекса находится за пределом.
10	java.lang.NegativeArraySizeException
Массив создан с отрицательным размером.
11	java.lang.NullPointerException
Недопустимое использование нулевой ссылки.
12	java.lang.NumberFormatException
Неверное преобразование строки в числовой формат.
13	java.lang.SecurityException
Попытка нарушить безопасность.
14	java.lang.StringIndexOutOfBounds
Попытка индексирования за пределами строки.
15	java.lang.UnsupportedOperationException
Была обнаружена неподдерживаемая операция.
 */