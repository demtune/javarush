package com.javarush.task.task15.task1525;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Файл в статическом блоке
*/

public class Solution {
    public static List<String> lines = new ArrayList<String>();

    static {
        String s;
        try {
            FileReader fr = new FileReader(Statics.FILE_NAME);
            BufferedReader br = new BufferedReader(fr);

            while ((s = br.readLine()) != null){
                lines.add(s);
            }
            fr.close();
            br.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println(lines);
    }
}
