package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        String fileName = new BufferedReader(new InputStreamReader(System.in)).readLine();
        FileInputStream fileInputStream = new FileInputStream(fileName);
        int[] byteCountArray = new int[256];

        while (fileInputStream.available() > 0) {
            byteCountArray[fileInputStream.read()] +=1;
        }
        int minCount = Integer.MAX_VALUE;
        for (int byteCount : byteCountArray) {
            if (byteCount > 0 && byteCount < minCount) minCount = byteCount;
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < byteCountArray.length; i++) {
            if (byteCountArray[i] == minCount) {
                list.add(i);
            }
        }
        fileInputStream.close();
        for (Integer result: list) {
            System.out.print(result + " ");
        }
    }
}
