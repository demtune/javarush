package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        Map<String, String > map = new HashMap<>();
        map.put("Pukin", "Ivan");
        map.put("Pukin", "2Ivan");
        map.put("2Pukin", "Ivan");
        map.put("3Pukin", "Ivan");
        map.put("4Pukin", "Ivan");
        map.put("5Pukin", "Ivan");
        map.put("6Pukin", "Ivan");
        map.put("7Pukin", "Ivan");
        map.put("8Pukin", "Ivan");
        map.put("9Pukin", "Ivan");
        //напишите тут ваш код

        return map;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
