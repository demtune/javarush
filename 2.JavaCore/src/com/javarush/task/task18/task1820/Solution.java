package com.javarush.task.task18.task1820;

import java.io.*;

/* 
Округление чисел
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName1 = new BufferedReader(new InputStreamReader(System.in)).readLine();
        String fileName2 = new BufferedReader(new InputStreamReader(System.in)).readLine();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName1));
        FileWriter writer = new FileWriter(fileName2)) {

            while (reader.ready()){

                String[] file1 = reader.readLine().split(" ");

                for (String num : file1){
                    double data = Double.parseDouble(num);
                    long itogo = Math.round(data);
                    writer.write(itogo + " ");
                }
            }
        }
    }
}


