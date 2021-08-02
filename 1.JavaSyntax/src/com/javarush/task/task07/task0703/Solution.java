package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String [] strings = new String[10];
        int[] list = new int[10];
        for (int i = 0; i<strings.length; i++){
            strings[i] = reader.readLine(); //записали строку в ячейку
            list[i] = strings[i].length(); // В каждую ячейку записали длину строки из массива строк
        }

        for (int i = 0; i< list.length; i++){
            System.out.println(list[i]);    //вывели лист
        }
        //напишите тут ваш код
    }
}
