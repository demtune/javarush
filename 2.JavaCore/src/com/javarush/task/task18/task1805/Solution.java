package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String fileName = new BufferedReader(new InputStreamReader(System.in)).readLine();

        FileInputStream fileInputStream = new FileInputStream(fileName);

        Set<Integer> byteSort = new TreeSet<>();

        while (fileInputStream.available() > 0) {
            byteSort.add(fileInputStream.read());
        }
        fileInputStream.close();
        for (Integer i: byteSort) {
            System.out.print(i + " ");
        }
    }
}
