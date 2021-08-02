package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) list.add(Integer.parseInt(reader.readLine()));

        ArrayList<Integer> odd = new ArrayList(); //нечетные
        ArrayList<Integer> even = new ArrayList();  //четные
        ArrayList<Integer> other = new ArrayList(); // остальные

        for (int i = 0; i<20; i++){
            Integer x = list.get(i);
            if (x % 3 == 0 || x % 2 == 0){
                if (x % 3 == 0){
                    odd.add(x);
                }
                if (x % 2 == 0){
                    even.add(x);
                }

            }
            else {
                other.add(x);
            }
        }

        printList(odd);
        printList(even);
        printList(other);
        //напишите тут ваш код
    }

    public static void printList(ArrayList<Integer> list) {

        for (Integer x : list){
            System.out.println(x);
        }
        //напишите тут ваш код
    }
}
