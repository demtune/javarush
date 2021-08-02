package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {

    public static class Woman{
        String name;
        int age;
        String address;


        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }


    public static class Man {
        String name;
        int age;
        String address;


        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }


    public static void main(String[] args) {
        Woman girl1 = new Woman("Katya", 20, "Chikago");
        Woman girl2 = new Woman("Jenya", 25, "NY");
        System.out.println(girl1.name + " " + girl1.age + " " + girl1.address);
        System.out.println(girl2.name + " " + girl2.age + " " + girl2.address);

        Man man1 = new Man("Kolya", 20, "MSK");
        Man man2 = new Man("Vasya", 25, "india");
        System.out.println(man1.name + " " + man1.age + " " + man1.address);
        System.out.println(man2.name + " " + man2.age + " " + man2.address);


        //напишите тут ваш код
    }

    //напишите тут ваш код
}
