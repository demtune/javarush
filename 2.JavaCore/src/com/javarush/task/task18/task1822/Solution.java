package com.javarush.task.task18.task1822;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

/* 
Поиск данных внутри файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str;
        try (BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()))) {
            while ((str = fileReader.readLine()) != null) {
                if (str.startsWith(args[0] + " ")) {    //начинается ли строка с указанного префикса
                    System.out.println(str);
                    break;
                }
            }
        }
    }
}
