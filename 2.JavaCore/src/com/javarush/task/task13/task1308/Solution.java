package com.javarush.task.task13.task1308;

/* 
Эй, ты там живой?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    public interface Person{
        default boolean isAlive(){
            return false;
        }
    }

    public interface Presentable extends Person{
        @Override
        default boolean isAlive() {
            return Person.super.isAlive();
        }
    }
}