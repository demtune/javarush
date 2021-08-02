package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandpaName = reader.readLine();
        Cat grandPa = new Cat(grandpaName);

        String grandmaName = reader.readLine();
        Cat grandMa = new Cat(grandmaName);


        String fatherName  = reader.readLine();
        Cat catFather = new Cat(fatherName, grandPa,null);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, null, grandMa);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catFather, catMother);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catFather, catMother);


        System.out.println(grandPa);
        System.out.println(grandMa);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catDaughter);
        System.out.println(catSon);

    }

    public static class Cat {
        private String name;
        private Cat father;
        private Cat mother;

        public Cat(String name) {
            this.name = name;
        }

        public Cat(String name, Cat father, Cat mother) {
            this.name = name;
            this.father = father;
            this.mother = mother;
        }



        @Override
        public String toString() {
            if (father == null) {
                if (mother == null){
                    return "The cat's name is " + name + ", no mother, no father ";
                }
                else {
                    return "The cat's name is " + name + ", mother is " + mother.name + ", no father";
                }
            }
            else {
                if (mother==null){
                    return "The cat's name is " + name + ", no mother, father is " + father.name;
                }
                else {
                    return "The cat's name is " + name + ", mother is " + mother.name + ", father is " + father.name;
                }
            }
        }
    }
}





