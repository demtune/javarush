package com.javarush.task.task19.task1906;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

/* 
Четные символы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();

        ArrayList<Integer> list = new ArrayList<>();

        try (FileReader fileReader = new FileReader(fileName1)) {
            while (fileReader.ready()){
                list.add(fileReader.read());
            }
        }

        try (FileWriter writer = new FileWriter(fileName2)){
            for (int i = 1; i < list.size(); i+=2) {
                writer.write((byte) (int) list.get(i));
            }
        }
        reader.close();
    }
}
