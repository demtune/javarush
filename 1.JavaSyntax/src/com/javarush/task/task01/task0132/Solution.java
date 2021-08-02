package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {

        int a = number%10; //  остаток от деления на 10, в данном случае число 6
        int b = (number%100)/10; // остаток от деления на 100 будет 46, делим на 10 - получается 4 и тд.
        int c = (number%1000)/100; //третье число 5
        return a+b+c;

    }
}