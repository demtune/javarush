package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] list = new int[10];
        for (int i = 0; i< list.length; i++){
            list[i] = Integer.parseInt(reader.readLine());  //заполнение массива
        }

        for (int i = list.length - 1; i>=0; i--){ //вывод массива в обратном порядке
            System.out.println(list[i]);
        }






        //напишите тут ваш код
    }
}

