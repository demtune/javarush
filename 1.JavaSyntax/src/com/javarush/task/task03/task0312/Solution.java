package com.javarush.task.task03.task0312;

/* 
Конвертируем время
*/

public class Solution {
    public static int convertToSeconds(int hour){
        return hour*3600;
    }//напишите тут ваш код

    public static void main(String[] args) {
        int hour1 = 12;
        int hour2 = 21;
        System.out.println(convertToSeconds(hour1));
        System.out.println(convertToSeconds(hour2));

        //напишите тут ваш код

    }
}
