package com.javarush.task.task19.task1920;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeMap;
import java.util.TreeSet;

/* 
Самый богатый
*/

public class Solution {
    public static void main(String[] args) {
        TreeMap<String, Double> map = new TreeMap<>();
        String fileName = args[0];  //первым парамом приходит имя файла

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {    //прочитали файл
            String[] splitLine;
            String line;
            Double currentValue;

            while ((line = reader.readLine()) != null) {
                splitLine = line.split(" ");        //разбили, прочитали строку и добавили в массив
                String name = splitLine[0];
                double value = Double.parseDouble(splitLine[1]);

                if (map.containsKey(name)) {
                    currentValue = map.get(name);       //если имя совпадает складываем значения
                    map.put(name, value + currentValue);    // и добавляем в паму
                } else {
                    map.put(name, value);
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        double max = map.firstEntry().getValue();   //первое и самое маленькое значение в тримап
        for (double value : map.values()) {
            if (value > max) {
                max = value;
            }
        }

        TreeSet<String> names = new TreeSet<>();    //трисет имен если значения макса совпадают добавляем в трисет
        for (String name : map.keySet()) {
            if (max == map.get(name)) {
                names.add(name);
            }
        }

        for (String name : names) {             //выводим трисет
            System.out.println(name);
        }
    }
}
