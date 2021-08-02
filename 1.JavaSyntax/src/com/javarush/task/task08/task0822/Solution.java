package com.javarush.task.task08.task0822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Минимальное из N чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> list) {

        int min = list.get(0);

        for (int i = 0; i<list.size(); i++){
            if (list.get(i) < min){
                min = list.get(i);
            }
        }
        return min;
    }

    public static List<Integer> getIntegerList() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i<n; i++){
            list.add(Integer.parseInt(reader.readLine()));
        }
        // Создать и заполнить список тут
        return list;
    }
}
