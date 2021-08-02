package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {

    String name = null;
    int age;
    int weight;
    String address = null;
    String color;

    public Cat(String name){
        this.name = name;
        this.age = 1;
        this.weight = 2;
        this.color = "red";
    }
    public Cat(String name, int weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "red";
    }

    public Cat(String name, int age){
        this.name = name;
        this.age = age;
        this.weight = 1;
        this.color = "red";
    }
    public Cat(int weight, String color){
        this.weight = weight;
        this.color = color;
        this.age = 1;
    }

    public Cat(int weight, String color, String address){
        this.weight = weight;
        this.color = color;
        this.address = address;
        this.age = 1;


    }









    //напишите тут ваш код

    public static void main(String[] args) {

    }
}
