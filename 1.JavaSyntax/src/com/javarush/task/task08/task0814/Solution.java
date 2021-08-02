package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static Set<Integer> createSet() {
        Set<Integer> set = new HashSet<>();

        set.add(34);
        set.add(21213);
        set.add(2112);
        set.add(213);
        set.add(236);
        set.add(567);
        set.add(46);
        set.add(3);
        set.add(435);
        set.add(7);

        set.add(2);
        set.add(23241);
        set.add(4);
        set.add(5);
        set.add(58);
        set.add(6);
        set.add(8);
        set.add(9);
        set.add(10);
        set.add(11);

        return set;

    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {

        Set<Integer> copy = new HashSet<>(set);

        for (Integer n : copy){
            if (n >10){
                set.remove(n);
            }
        }
        return set;


        // напишите тут ваш код

    }

    public static void main(String[] args) {

    }
}
