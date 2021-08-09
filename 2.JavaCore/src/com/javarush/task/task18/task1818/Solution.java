package com.javarush.task.task18.task1818;

import java.io.*;

/* 
Два в одном
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName1 = new BufferedReader(new InputStreamReader(System.in)).readLine();
        String fileName2 = new BufferedReader(new InputStreamReader(System.in)).readLine();
        String fileName3 = new BufferedReader(new InputStreamReader(System.in)).readLine();

        FileOutputStream fileOutputStream1 = new FileOutputStream(fileName1,true);

        try (FileReader fileReader2 = new FileReader(fileName2)) {
            while (fileReader2.ready()){
                fileOutputStream1.write(fileReader2.read());
            }
            try (FileReader fileReader3 = new FileReader(fileName3)) {
                while (fileReader3.ready()){
                    fileOutputStream1.write(fileReader3.read());
                }
            }
        }
        fileOutputStream1.close();
    }
}
