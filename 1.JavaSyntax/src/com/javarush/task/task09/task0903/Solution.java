package com.javarush.task.task09.task0903;

/* 
Кто меня вызывал?
*/

public class Solution {
    public static void main(String[] args) {
        method1();
    }

    public static int method1() {
        method2();
        for (StackTraceElement t : Thread.currentThread().getStackTrace()){
            System.out.println(t);
        }
        System.out.println();
        return Thread.currentThread().getStackTrace()[2].getLineNumber();
    }

    public static int method2() {
        method3();
        for (StackTraceElement t : Thread.currentThread().getStackTrace()){
            System.out.println(t);
        }
        System.out.println();
        return Thread.currentThread().getStackTrace()[2].getLineNumber();
    }

    public static int method3() {
        method4();
        for (StackTraceElement t : Thread.currentThread().getStackTrace()){
            System.out.println(t);
        }
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        System.out.println();
        return Thread.currentThread().getStackTrace()[2].getLineNumber();
    }

    public static int method4() {
        method5();
        for (StackTraceElement t : Thread.currentThread().getStackTrace()){
            System.out.println(t);
        }
        System.out.println();
        return Thread.currentThread().getStackTrace()[2].getLineNumber();
    }

    public static int method5() {
        for (StackTraceElement t : Thread.currentThread().getStackTrace()){
            System.out.println(t);
        }
        System.out.println();
        return Thread.currentThread().getStackTrace()[2].getLineNumber();
    }
}
