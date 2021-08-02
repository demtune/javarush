package com.javarush.task.task09.task0906;

/* 
Логирование стек-трейса
*/

public class Solution {
    public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String text) {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        String className = stackTraceElements[2].getClassName();    //2 потому что 0 - гетстактрэйс мето, 1 лог, где вызван гетстактрейс, 2 -мэйн
        String methodName = stackTraceElements[2].getMethodName();
        System.out.println(className + ": " + methodName + ": " + text);
        //напишите тут ваш код
    }
}
