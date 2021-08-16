package com.javarush.task.task19.task1910;

import java.io.*;
import java.util.ArrayList;

/* 
Пунктуация
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        String inputFile;
        String outputFile;

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            inputFile = reader.readLine();
            outputFile = reader.readLine();
        }

        ArrayList<String> list = new ArrayList<>();

        try (BufferedReader inputReader = new BufferedReader(new FileReader(inputFile))) {

            while (inputReader.ready()){
                list.add(inputReader.readLine());
            }
        }

        try (BufferedWriter outputWriter = new BufferedWriter(new FileWriter(outputFile))) {

            for (String s : list) {
                outputWriter.write(s.replaceAll("\\p{P}", ""));
            }
        }
    }
}
