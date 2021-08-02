package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        int [] list1 = getInts();
        int maximum =list1[0];
        int minimum = list1[0];


        for (int i = 0; i<list1.length; i++){

            if (list1[i]>maximum){
                maximum = list1[i];
            }
            if (list1[i]< minimum){
                minimum = list1[i];
            }

        }

        //напишите тут ваш код

        System.out.print(maximum + " " + minimum);
    }

    public static int[] getInts() throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] numbers = new int[20];

        for (int i = 0; i<numbers.length; i++){
            numbers[i]= Integer.parseInt(reader.readLine());
        }
        return numbers;
    }
}

    //напишите тут ваш код

