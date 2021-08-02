package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputString = reader.readLine();

        SimpleDateFormat input = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        Date date = input.parse(inputString);

        SimpleDateFormat output = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
        System.out.println(output.format(date).toUpperCase());




        //напишите тут ваш код
    }
}
