package com.javarush.task.task19.task1925;

import java.io.*;
import java.util.ArrayList;

/* 
Длинные слова
*/

public class Solution {
    public static void main(String[] args) {
        String fileName1 = args[0];
        String fileName2 = args[1];
        String input;

        ArrayList<String> list = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName1))) {
            while ((input = reader.readLine()) != null) {
                list.add(input);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        StringBuffer sb = new StringBuffer();
        for (String s : list) {
            String[] splitLine = s.split(" ");

            for (String word : splitLine) {
                if (word.length() > 6) {
                    sb.append(word).append(" ");
                }
            }
        }
        String result = sb.toString().trim().replaceAll(" ", ",");

        try (FileWriter writer = new FileWriter(fileName2)) {
            writer.write(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
