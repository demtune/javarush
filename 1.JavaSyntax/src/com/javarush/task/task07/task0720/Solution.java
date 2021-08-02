package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());


        ArrayList<String> list = new ArrayList();
        for (int i = 0; i<n; i++){
            String s = reader.readLine();           //н строками просто заполнили список
            list.add(s);
        }

        for (int i = 0; i<m; i++){
            list.add(list.remove(0));   //перестановка м элементов из начала в конец списка
        }

        for (String s : list){
            System.out.println(s);
        }
    }
}
