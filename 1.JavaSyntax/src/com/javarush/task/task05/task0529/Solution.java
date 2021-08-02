package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;


        while (true){
            String s = reader.readLine(); //первая обертка для проверки строки остановки
            if (s.equals("сумма")){
                System.out.println(sum);
                break;
            }


            int a = Integer.parseInt(s); //вторая обертка для вывода чисел и перевод в сумму
            sum = sum+a; //считаем сумму

        }
    }
}
