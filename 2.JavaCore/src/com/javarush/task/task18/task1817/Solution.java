package com.javarush.task.task18.task1817;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/* 
Пробелы
*/

public class Solution {
    public static void main(String[] args) throws IOException {


        int countChar = 0;
        int countSpace = 0;

        try (FileReader fileReader = new FileReader(args[0])){
            while (fileReader.ready()){
                int data = (char) fileReader.read();
                countChar++;
                if (data == ' ')
                    countSpace++;
            }
        }
        if (countChar !=0 ){
            double result = (double) countSpace/countChar * 100;
            System.out.printf("%.2f",result);       //оставить 2 знака после запятой
        }
    }
}
