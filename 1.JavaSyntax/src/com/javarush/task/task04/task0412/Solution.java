package com.javarush.task.task04.task0412;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Положительное и отрицательное число
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        if (a>0)
            System.out.println(a*2);
        else if (a<0)
            System.out.println(a+1);
        else if (a == 0)
            System.out.println(a);

        //напишите тут ваш код

    }

}