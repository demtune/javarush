package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(reader.readLine()));
            String s = "";
            while ((s = reader.readLine()) != null){
                if (s.equals("exit")){
                    writer.write(s);
                    break;
                }
                else writer.write(s + "\n");
            }
            writer.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
