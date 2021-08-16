package com.javarush.task.task19.task1907;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Считаем слово
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        int countWord = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileName =  br.readLine();

        StringBuilder stringBuilder = new StringBuilder();

        try (FileReader fileReader = new FileReader(fileName)) {
            char currentText;

            while (fileReader.ready()) {
                currentText = (char) fileReader.read();
                stringBuilder.append(currentText);
            }
        }
        br.close();

        String replaceAll = stringBuilder.toString().replaceAll("\\p{P}", " ").replaceAll("\\s", " ");  //удаляем знаки препинания и символ пробела

        for (String s : replaceAll.split( " ")){    //бежим по массиву разделив строку на слова
            if (s.equals("world")){
                countWord++;
            }
        }
        System.out.println(countWord);
    }
}
