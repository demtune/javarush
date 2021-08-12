package com.javarush.task.task18.task1821;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/* 
Встречаемость символов
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        int [] AscII = new int[128];

        try (FileReader fileReader = new FileReader(args[0])) {

            while (fileReader.ready()) {
                AscII[fileReader.read()]++;
            }
            for (int i = 0; i < AscII.length; i++) {
                if (AscII[i] != 0){

                    System.out.println((char) i + " " + AscII[i]);
                }
            }
        }

    }
}
