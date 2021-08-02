package com.javarush.task.task14.task1418;

import java.util.LinkedList;
import java.util.List;

/* 
Исправь четыре ошибки
*/

public class Solution {
    public static void initList(List<Number> list){

        list.add(new Double(1000f));
        list.add(new Double("123e-445632"));
        list.add(new Float(-90 / -3));
        list.remove(new Double("123e-445632"));
    }
    public static void printListValues(List<Number> list){
        for (Number number : list){
            System.out.println(number);
        }
    }

    public static void processCastedObjects(List<Number> list){
        for (Number number : list){
            if (number instanceof Float){
                System.out.println("Is float value defined? " + !(((Float) number).isNaN()));
            } else if (number instanceof Double){
                System.out.println("Is double value infinite? " + ((Double) number).isInfinite());
            }
        }
    }

    public static void main(String[] args) {
        List<Number> list = new LinkedList<Number>();
        initList(list);
        printListValues(list);
        processCastedObjects(list);

    }
}
