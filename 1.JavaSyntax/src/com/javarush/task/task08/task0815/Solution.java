package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String , String > map = new HashMap<>();
        map.put("Pupkin", "Jora");
        map.put("Pupkin1", "Jora");
        map.put("Pupkin2", "Jora");
        map.put("Pupkin3", "Jora");
        map.put("Pupkin4", "Jora");
        map.put("Pupkin5", "Jora");
        map.put("Pupkin6", "Jora");
        map.put("Pupkin7", "Jora");
        map.put("Pupkin8", "Jora");
        map.put("Pupkin9", "Jora");

        return map;

        //напишите тут ваш код

    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int countValue = 0;

        for (String mapName : map.values()){
            if (mapName.equals(name)){
                countValue++;
            }
        }
        return countValue;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int countKey= 0;
        for (String mapLst : map.keySet()){
            if (mapLst.equals(lastName)){
                countKey++;
            }

        }
        return countKey;


    }

    public static void main(String[] args) {

    }
}
