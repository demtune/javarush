package com.javarush.task.task19.task1924;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Замена чисел
*/

public class Solution {
    public static Map<Integer, String> map = new HashMap<>();

    static {
        map.put(0, "ноль");
        map.put(1, "один");
        map.put(2, "два");
        map.put(3, "три");
        map.put(4, "четыре");
        map.put(5, "пять");
        map.put(6, "шесть");
        map.put(7, "семь");
        map.put(8, "восемь");
        map.put(9, "девять");
        map.put(10, "десять");
        map.put(11, "одиннадцать");
        map.put(12, "двенадцать");
    }

    public static void main(String[] args) {
        String fileName = null;

        try (BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in))){        //  читаем имя файла
            fileName = reader1.readLine();

        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader reader2 = new BufferedReader(new FileReader(fileName))) {       //читаем содержимое файла
            String line;
            while ((line = reader2.readLine()) != null) {
                for (Map.Entry<Integer, String> entry : map.entrySet()) {
                    line = line.replaceAll("\\b" + entry.getKey() + "\\b", entry.getValue());  //меняем ключ, заменяем его значением
                }
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("IOException");
        }
    }
}
