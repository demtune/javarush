package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        strings = new ArrayList<>();

        for (int i = 0; i<5; i++){
            strings.add(reader.readLine());
        }

        int maxString = strings.get(0).length();

        for (String s : strings) {
            if (s.length() > maxString) {
                maxString = s.length();
            }
        }

        for (String s : strings){
            if (maxString == s.length()){
                System.out.println(s);
            }
        }
    }
}
