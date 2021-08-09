package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws CorruptedDataException {
        String name1 = null;
        String name2 = null;

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            name1 = reader.readLine();
            name2 = reader.readLine();
            reader.close();

            BufferedReader fileReader1 = new BufferedReader(new FileReader(name1));
            String input;
            while ((input = fileReader1.readLine()) !=null){
                allLines.add(input);
            }
            fileReader1.close();

            BufferedReader fileReader2 = new BufferedReader(new FileReader(name2));
            while ((input = fileReader2.readLine()) != null){
                forRemoveLines.add(input);
            }
            fileReader2.close();


        } catch (IOException e) {
            e.printStackTrace();
        }

        new Solution().joinData();
    }

    public void joinData() throws CorruptedDataException {

        if (allLines.containsAll(forRemoveLines)){
            allLines.removeAll(forRemoveLines);
        }
        else{
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
