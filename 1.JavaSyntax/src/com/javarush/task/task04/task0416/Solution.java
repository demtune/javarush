package com.javarush.task.task04.task0416;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переходим дорогу вслепую
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double t = Double.parseDouble(reader.readLine());
        t = t%5;
        if (t >=0 && t<3){
            System.out.println("зеленый");
        }
        else if(t>=3 && t<4){
            System.out.println("желтый");
        }
        else if (t>=4 && t<5){
            System.out.println("красный");
        }



        //напишите тут ваш код

    }
}