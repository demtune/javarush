package com.javarush.task.task18.task1816;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* 
Английские буквы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        int [] aSCII = new int[128];

        try (FileReader fileReader = new FileReader(args[0])){
            while (fileReader.ready()){
                aSCII[fileReader.read()]++;
            }

            for (int i = 0; i < aSCII.length; i++) {


            }

        }

    }
}
