package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        double usd1 = convertEurToUsd(22, 1);
        double usd2 = convertEurToUsd(44, 2);
        System.out.println(usd1);
        System.out.println(usd2);
        //напишите тут ваш код

    }

    public static double convertEurToUsd(int eur, double exchangeRate) {
     return eur * exchangeRate;    //напишите тут ваш код

    }
}
