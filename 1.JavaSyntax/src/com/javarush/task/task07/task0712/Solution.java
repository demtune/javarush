package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }

        String minString = list.get(0);
        int minIndex = 0;
        String maxString = list.get(0);
        int maxIndex = 0;


        for (int i = 0; i < 10; i++) {

            if (list.get(i).length() < minString.length()) {
                minString = list.get(i);
                minIndex = i;

            } else if (list.get(i).length() > maxString.length()) {
                maxString = list.get(i);
                maxIndex = i;
            }
        }

        if (minIndex < maxIndex) {
            System.out.println(minIndex);
        } else {
            System.out.println(maxIndex);
        }
    }
}