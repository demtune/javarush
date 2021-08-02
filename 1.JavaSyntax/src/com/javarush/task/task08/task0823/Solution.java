package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.*;
import java.util.Arrays;
import java.util.Locale;
import java.util.stream.Collectors;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();

        String[] chars = string.trim().split(" +"); //trim удаляет проблеы вначале и в конце строки strim " +" 1 и более пробелов
        String result = "";
        for (int i = 0; i < chars.length; i++) {        //идем по массиву
            result += chars[i].substring(0,1).toUpperCase() + chars[i].substring(1) + " ";  //увеличиваем первую букву уппером и добавляем остаток строки

        }
        System.out.println(result);

    }
}


//public class Solution {
//    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String string = reader.readLine();
//
//        System.out.println(
//                Arrays.stream(string.trim().split(" +"))
//                        .map(s -> s.substring(0,1).toUpperCase() + s.substring(1))
//                        .collect(Collectors.joining(" "))
//        );
//    }
//}


        


