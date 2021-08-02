package com.javarush.task.task14.task1420;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
НОД
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            int max = Integer.parseInt(reader.readLine());
            int min = Integer.parseInt(reader.readLine());
            
            if (max < 1 || min < 1) {
                throw new IllegalArgumentException();
            }
            int a = Math.abs(max);
            int b = Math.abs(min);

                while (a > 0){
                    if (a < b){
                        int temp = a;
                        a = b;
                        b = temp;
                    }
                    a %= b;
                }
                System.out.println(b);
    }
}
