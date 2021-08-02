package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int [] big = new int[20];

        for (int i = 0; i< big.length; i++){
            big[i] = Integer.parseInt(reader.readLine());
        }

        int[] list1 = new int[10];
        int[] list2 = new int[10];
        for (int i = 0; i<10; i++){
            list1[i] = big[i];      //первую половину от бига отдали в лист1
            list2[i] = big[i+10];   // вторую половину от бига отдали в лист 2
        }
        for (int i = 0; i<10; i++)
        System.out.println(list2[i]);// выводим лист 2


        //напишите тут ваш код
    }
}
