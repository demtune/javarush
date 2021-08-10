package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String readString;

        while (!(readString = reader.readLine()).equals("exit")) {
            new ReadThread(readString).start();
        }
    }

    public static class ReadThread extends Thread {

        private String fileName;
        public ReadThread(String fileName) {
            this.fileName = fileName;
            //implement constructor body
        }

        @Override
        public void run() {
            int[] byteCount = new int[256];
            try (FileInputStream fileInputStream = new FileInputStream(fileName)){

                while (fileInputStream.available()>0) {
                    int data = fileInputStream.read();
                    byteCount[data]++;
                }

            } catch (IOException e) {
                e.printStackTrace();
            }

            int maxCount = 0;
            int byteIndex = 0;

            for (int i = 0; i<byteCount.length; i++){
                if (byteCount[i] > maxCount) {
                    maxCount = byteCount[i];
                    byteIndex = i;
                }
            }
            resultMap.put(fileName,byteIndex);
        }
    }
}
