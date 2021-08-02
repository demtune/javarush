package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList();

        for (int i = 0; i<5; i++){
            list.add(reader.readLine());        //наполнили список
        }

        int minString = list.get(0).length();   //мин строку считаем нулевой элемент

        for (String s : list){
            if (s.length()< minString){     //проходимся по циклу, находим минимальную строку
                minString = s.length();

            }
        }

        for (String s : list) {
            if (s.length() == minString) {  //выводим минимальную строку или равные
                System.out.println(s);
            }
        }





        //напишите тут ваш код
    }
}
