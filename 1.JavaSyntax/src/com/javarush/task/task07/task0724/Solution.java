package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {

        Human PapagrandFather = new Human("Ded", true, 60 );
        Human PapagrandMother = new Human("Baba", false, 52);

        Human MAMAgrandFather = new Human("Ded1", true, 62 );
        Human MAMAgrandMother = new Human("Baba1", false, 53);

        Human Father = new Human("Batya", true, 40, PapagrandFather.father, PapagrandMother.mother);
        Human Mother = new Human("Matya", false, 34,MAMAgrandFather.father, MAMAgrandMother.mother);

        Human child1 = new Human("Son1", true,12, Father.father, Mother.mother);
        Human child2 = new Human("Daughter", false,13, Father.father, Mother.mother);
        Human child3 = new Human("Daughter1", false,15, Father.father, Mother.mother);

        System.out.println(PapagrandFather);
        System.out.println(PapagrandMother);
        System.out.println(MAMAgrandFather);
        System.out.println(MAMAgrandMother);
        System.out.println(Father);
        System.out.println(Mother);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);

        // напишите тут ваш код
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }


        // напишите тут ваш код

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}