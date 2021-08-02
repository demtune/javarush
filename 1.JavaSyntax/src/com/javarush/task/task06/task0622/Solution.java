package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] list = new int[5];

        for (int i = 0; i< list.length; i++){
            list[i] = Integer.parseInt(reader.readLine());
        }


        sort(list);

        for (int x: list){
            System.out.println(x);
        }




        //напишите тут ваш код
    }

    public static void sort(int[] list){
        for (int i = 0; i < list.length; i++) {
            for (int j = i; j < list.length; j++) {
                if (list[i] > list[j]) {
                    int temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;             //пузырек блядь
                }
            }
        }
    }

}

