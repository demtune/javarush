package com.javarush.task.task08.task0827;

import java.util.Date;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {

        Date startDate = new Date(date);    //время старта
        startDate.setDate(1);               //первое число
        startDate.setMonth(0);              //месяц январь, нумерация для месяцев 0-11


        Date currentDate = new Date(date);
        long time =  currentDate.getTime() - startDate.getTime();
        long days = time / 24 / 60 / 60000 + 1;
        return days % 2 == 1;

    }
}
