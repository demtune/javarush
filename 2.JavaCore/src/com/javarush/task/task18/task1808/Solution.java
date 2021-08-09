package com.javarush.task.task18.task1808;

import java.io.*;
import java.util.ArrayList;

/* 
Разделение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName1 = new BufferedReader(new InputStreamReader(System.in)).readLine();
        String fileName2 = new BufferedReader(new InputStreamReader(System.in)).readLine();
        String fileName3 = new BufferedReader(new InputStreamReader(System.in)).readLine();

        FileInputStream fileInputStream = new FileInputStream(fileName1);
        FileOutputStream fileOutputStream2 = new FileOutputStream(fileName2);
        FileOutputStream fileOutputStream3 = new FileOutputStream(fileName3);


        int delenie = (fileInputStream.available()+ 1) / 2;
        int numByte = 0;

        while (fileInputStream.available() > 0) {
            if (numByte < delenie) {
                fileOutputStream2.write(fileInputStream.read());
                numByte++;
            }
            else fileOutputStream3.write(fileInputStream.read());
        }
        fileInputStream.close();
        fileOutputStream3.close();
        fileOutputStream2.close();
    }
}
