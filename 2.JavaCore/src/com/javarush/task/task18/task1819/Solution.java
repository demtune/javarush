package com.javarush.task.task18.task1819;

import java.io.*;

/* 
Объединение файлов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName1 = new BufferedReader(new InputStreamReader(System.in)).readLine();
        String fileName2 = new BufferedReader(new InputStreamReader(System.in)).readLine();

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        try (FileInputStream fileInputStream1 = new FileInputStream(fileName1);
             FileInputStream fileInputStream2 = new FileInputStream(fileName2)){
            while (fileInputStream2.available()> 0) {
                byteArrayOutputStream.write(fileInputStream2.read());   //считали второй и байтарай
            }

            while (fileInputStream1.available() > 0) {
                byteArrayOutputStream.write(fileInputStream1.read());   //считали первый и записали в байтарай
            }
        }

        try (FileOutputStream fileOutputStream = new FileOutputStream(fileName1)) {
            byteArrayOutputStream.writeTo(fileOutputStream);            //байтарай записали в первый файл
        }
    }
}

