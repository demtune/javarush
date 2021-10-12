package com.javarush.task.task19.task1926;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Перевертыши
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        try(BufferedReader fileInput = new BufferedReader(new FileReader(fileName))) {

            while (fileInput.ready()){
                String line = fileInput.readLine();
                System.out.println(new StringBuffer(line).reverse());
            }
        }
    }
}
