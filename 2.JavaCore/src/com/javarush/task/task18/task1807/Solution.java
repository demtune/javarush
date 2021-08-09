package com.javarush.task.task18.task1807;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Подсчет запятых
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        String fileName = new BufferedReader(new InputStreamReader(System.in)).readLine();

        FileInputStream fileInputStream = new FileInputStream(fileName);
        int count = 0;

        while (fileInputStream.available() > 0){
            if (fileInputStream.read() == 44){
                count++;
            }
        }
        System.out.println(count);
        fileInputStream.close();
    }
}


//44

