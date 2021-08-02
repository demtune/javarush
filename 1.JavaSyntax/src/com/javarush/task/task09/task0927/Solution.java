package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        Map <String, Cat> result = new HashMap<>();
        result.put("Vaska1", new Cat("Vaska"));
        result.put("Vaska2", new Cat("Vaska"));
        result.put("Vaska3", new Cat("Vaska"));
        result.put("Vaska4", new Cat("Vaska"));
        result.put("Vaska5", new Cat("Vaska"));
        result.put("Vaska6", new Cat("Vaska"));
        result.put("Vaska7", new Cat("Vaska"));
        result.put("Vaska8", new Cat("Vaska"));
        result.put("Vaska9", new Cat("Vaska"));
        result.put("Vaska10", new Cat("Vaska"));
        return result;
        //напишите тут ваш код
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        return new HashSet<>(map.values());


        //напишите тут ваш код
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
