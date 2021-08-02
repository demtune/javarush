package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String name;
        private int age;
        private boolean sex;
        private int height;
        private String skin;
        private String language;

        public Human(String name) {
            this.name = name;
        }

        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Human(String name, int age, boolean sex) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        public Human(String name, int age, boolean sex, int height) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.height = height;
        }

        public Human(String name, int age, boolean sex, int height, String skin) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.height = height;
            this.skin = skin;
        }

        public Human(String name, int age, boolean sex, int height, String skin, String language) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.height = height;
            this.skin = skin;
            this.language = language;
        }

        public Human(int age, boolean sex) {
            this.age = age;
            this.sex = sex;
        }

        public Human(int age, boolean sex, int height) {
            this.age = age;
            this.sex = sex;
            this.height = height;
        }

        public Human(boolean sex, int height, String skin) {
            this.sex = sex;
            this.height = height;
            this.skin = skin;
        }

        public Human(String skin, String language) {
            this.skin = skin;
            this.language = language;
        }

        // Напишите тут ваши переменные и конструкторы
    }
}
