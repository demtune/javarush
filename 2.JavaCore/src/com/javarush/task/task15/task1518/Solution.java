package com.javarush.task.task15.task1518;

/* 
Статики и котики
*/

public class Solution {
    public static Cat cat;

    public static class Cat {
        public String name;

    }
    static {
        Cat cat1 = new Cat();
        cat1.name = "Vaska";
        cat = cat1;
        System.out.println(cat.name);

    }

    public static void main(String[] args) {

    }
}
