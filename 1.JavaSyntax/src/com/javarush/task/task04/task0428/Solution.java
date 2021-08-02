package com.javarush.task.task04.task0428;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Положительное число
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int countPozitive = 0;

        if (a>0){
            countPozitive++;
        }
        if (b>0){
            countPozitive++;
        }
        if (c>0){
            countPozitive++;
        }
        System.out.println(countPozitive);

        //напишите тут ваш код

    }
}
