package com.javarush.task.task18.task1809;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Реверс файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        String fileName1 = new BufferedReader(new InputStreamReader(System.in)).readLine();
        String fileName2 = new BufferedReader(new InputStreamReader(System.in)).readLine();

        FileInputStream fileInputStream = new FileInputStream(fileName1);
        FileOutputStream fileOutputStream = new FileOutputStream(fileName2);

        ArrayList<Integer> list = new ArrayList<>();

        while (fileInputStream.available() > 0){
            list.add(fileInputStream.read());
            
        }
        Collections.reverse(list);
        for (Integer result : list){
            fileOutputStream.write(result);
        }
        fileInputStream.close();
        fileOutputStream.close();
    }
}
