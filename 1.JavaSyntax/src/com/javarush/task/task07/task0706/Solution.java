package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] countPeople = new int[15];

        for (int i = 0; i< countPeople.length; i++){
            countPeople[i] = Integer.parseInt(reader.readLine()); //наполнили массив жителями
        }

        int even = 0;
        int odd = 0;

        for (int i = 0; i< countPeople.length; i++){ //идем по массиву
            if (i%2 == 0){
                even += countPeople[i]; //четные
            }
            else {
                odd += countPeople[i]; //нечетные
            }
        }

        if (even>odd){
            System.out.println("В домах с четными номерами проживает больше жителей.");
        }
        else {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }
    }
}
