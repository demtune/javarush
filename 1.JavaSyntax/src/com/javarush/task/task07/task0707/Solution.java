package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Va");
        list.add("Sya");
        list.add("Ko");
        list.add("Ly");
        list.add("Lya");

        System.out.println(list.size());

        for (String s : list){
            System.out.println(s);
        }


        //напишите тут ваш код
    }
}
