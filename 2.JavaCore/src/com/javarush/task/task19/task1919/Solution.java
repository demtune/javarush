package com.javarush.task.task19.task1919;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeMap;

/* 
Считаем зарплаты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String fileName = args[0];
        TreeMap<String, Double> map = new TreeMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            String[] splitLine;
            Double currentValue;
            while ((line = reader.readLine()) != null) {
                splitLine = line.split(" ");
                String name = splitLine[0];
                double value = Double.parseDouble(splitLine[1]);

                if (map.containsKey(name)) {
                    currentValue = map.get(name);
                    map.put(name, value + currentValue);
                } else {
                    map.put(name, value);
                }
            }
        }
        for (String s : map.keySet()) {
            System.out.println(s + " " +  map.get(s));
        }
    }
}
