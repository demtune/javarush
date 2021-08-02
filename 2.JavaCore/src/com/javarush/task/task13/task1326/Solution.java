package com.javarush.task.task13.task1326;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/* 
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());
        DataInputStream dataInputStream = new DataInputStream(fileInputStream);

        ArrayList<Integer> list = new ArrayList<>();

        while (dataInputStream.available()>0){
            int a = Integer.parseInt(dataInputStream.readLine());
            if (a % 2 == 0) list.add(a);
            }

            Collections.sort(list);

            for (Integer b : list){
                System.out.println(b);
            }
            reader.close();
            fileInputStream.close();
    }
}

