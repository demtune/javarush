package com.javarush.task.task19.task1908;

import java.io.*;
import java.util.ArrayList;

/* 
Выделяем числа
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String inputFile;
        String outputFile;

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            inputFile = reader.readLine();
            outputFile = reader.readLine();
        }

        ArrayList <String > list = new ArrayList<>();

        try (BufferedReader inputFileReader = new BufferedReader(new FileReader(inputFile))) {
            while (inputFileReader.ready()){
                list.add(inputFileReader.readLine());
            }
        }

        try (BufferedWriter outputFileWriter = new BufferedWriter(new FileWriter(outputFile))){
            for (String s : list) {
                String[] split = s.trim().split(" ");
                for (String s1 : split) {
                        outputFileWriter.write(s1 + " ");
                }
            }
        }
    }
}


