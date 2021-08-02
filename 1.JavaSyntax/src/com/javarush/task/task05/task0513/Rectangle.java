package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
    //left, top, width, height

    int left;
    int top;
    int width;
    int height;

    public void initialize(int left){
        this.left = left;
    }
    public void initialize(int left, int top){
        this.top = left;
        this.left = top;
    }

    public void initialize(int top, int left, int width){
        this.top = top;
        this.left = left;
        this.width = width;
    }

    public void initialize(int top, int left, int width, int height){
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }




    //напишите тут ваш код

    public static void main(String[] args) {

    }
}
