package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {

    String name;
    int age;
    int weight;
    String address = null;
    String color;

    public void initialize(String name){
        this.name = name;
        this.age = 1;
        this.weight = 1;
        this.color = "рыжий";

    }

    public void initialize(String name, int weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "рыжий";

    }

    public void initialize(String name, int age){
        this.name = name;
        this.age = age;

    }

    public void initialize(int weight,String  color){
        this.weight = weight;
        this.color = color;
        this.age = 1;


    }

    public void initialize(int weight, String color, String address){
        this.weight = weight;
        this.color = color;
        this.address = address;
        this.age = 1;

    }



    //напишите тут ваш код
}
