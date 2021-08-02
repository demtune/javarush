package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws Exception{

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream fileInputStream = new FileInputStream(reader.readLine());

        while (fileInputStream.available() > 0){
            System.out.print((char) fileInputStream.read());
        }

        reader.close();
        fileInputStream.close();

    }
}