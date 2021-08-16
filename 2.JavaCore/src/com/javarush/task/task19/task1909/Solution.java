package com.javarush.task.task19.task1909;

import java.io.*;
import java.util.ArrayList;

/* 
Замена знаков
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();

        ArrayList<String> list = new ArrayList<>();

        try ( BufferedReader fileReader = new BufferedReader(new FileReader(fileName1))){
            while (fileReader.ready()){
                list.add(fileReader.readLine());
            }
        }

        try (BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileName2))){

            for (String s : list) {
               fileWriter.write(s.replaceAll("\\.", "!"));
            }
        }
        reader.close();
    }
}
