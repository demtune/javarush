package com.javarush.task.task05.task0532;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Задача по алгоритмам Ӏ Java Syntax: 5 уровень, 12 лекция
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(reader.readLine());

        if (number<= 0){
            return;
        }

        int[] list = new int[number];
        for (int i = 0; i < list.length; i++){
            list[i] = Integer.parseInt(reader.readLine());
        }
        int max = list[0];

        for (int i = 0; i< list.length; i++){
            if (list[i]> max){
                max = list[i];
            }
        }

        System.out.println(max);




        //напишите тут ваш код

    }
}
