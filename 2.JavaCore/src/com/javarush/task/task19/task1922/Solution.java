package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {

        String fileName = null;


        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            fileName = br.readLine();
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            while (reader.ready()){
                String readString = reader.readLine();
                String[] split = readString.split(" ");
                int wordCount = 0;

                for (String s : split) {
                    if (words.contains(s)){
                        wordCount++;
                    }
                }
                if (wordCount == 2){
                    System.out.println(readString);
                }
            }
        }
    }
}
