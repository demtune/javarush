package com.javarush.task.task04.task0429;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Положительные и отрицательные числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int countPozitive = 0;
        int countNegative = 0;
        if (a>0){
            countPozitive++;
        }
        else if (a<0){
            countNegative++;
        }

        if (b>0){
            countPozitive++;
        }
        else if (b<0){
            countNegative++;
        }

        if (c>0){
            countPozitive++;
        }
        else if (c<0){
            countNegative++;
        }
        System.out.println("количество отрицательных чисел: " + countNegative);
        System.out.println("количество положительных чисел: " + countPozitive);
        //напишите тут ваш код

    }
}
