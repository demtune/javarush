package com.javarush.task.task08.task0824;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Собираем семейство
*/

public class Solution {
    public static void main(String[] args) {

        Human child1 = new Human("Vasya",2,true);
        Human child2 = new Human("Vasya",4,true);
        Human child3 = new Human("Vasya",3,true);

        Human father = new Human("Jenya", 30,true, child1, child2, child3);
        Human mother = new Human("Katya", 24,false, child1,child2,child3);


        Human grandPa1 = new Human("Kolya",65,true, father);
        Human grandMa1 = new Human("Nadya",60,false, father);
        Human grandPa2 = new Human("Vova",65,true, mother);
        Human grandMa2 = new Human("Valya",60,false, mother);

        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);

        System.out.println(father);
        System.out.println(mother);

        System.out.println(grandPa1);
        System.out.println(grandMa1);
        System.out.println(grandPa2);
        System.out.println(grandMa2);



        //напишите тут ваш код
    }

    public static class Human {

        String name;
        int age;
        boolean sex;
        List<Human> children =new ArrayList<>();

        public Human(String name, int age, boolean sex) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        public Human(String name, int age, boolean sex, Human... children) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            Collections.addAll(this.children, children);
        }
        //напишите тут ваш код

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
