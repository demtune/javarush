package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {

        Map<String, Integer> map = new HashMap<>();
        map.put("Pupkin", 334 );
        map.put("Pupkin1", 4563 );
        map.put("Pupkin2", 463 );
        map.put("Pupkin3", 34534 );
        map.put("Pupkin4", 3453 );
        map.put("Pupkin5", 345 );
        map.put("Pupkin6", 35 );
        map.put("Pupkin7", 3533 );
        map.put("Pupkin8", 333 );
        map.put("Pupkin9", 300 );
        return map;
        //напишите тут ваш код
    }

    public static void removeItemFromMap(Map<String, Integer> map) {

        Map<String, Integer> copy = new HashMap<>(map);

        for (Map.Entry<String, Integer> pair : copy.entrySet()){
            if (pair.getValue()< 500){
                map.remove(pair.getKey());
            }
        }

        //напишите тут ваш код
    }

    public static void main(String[] args) {

    }
}