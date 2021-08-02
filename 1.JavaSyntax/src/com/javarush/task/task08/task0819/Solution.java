package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        cats.remove(cats.iterator().next());
        //напишите тут ваш код. step 3 - пункт 3

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        Set<Cat> cats = new HashSet<>();
        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());
        //напишите тут ваш код. step 2 - пункт 2
        return cats;
    }

    public static void printCats(Set<Cat> cats) {
        for (Cat s : cats){
            System.out.println(s);
        }

        // step 4 - пункт 4
    }

    public static class Cat{


    }

    // step 1 - пункт 1
}
