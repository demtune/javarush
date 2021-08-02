package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        double sum = 0;
        int count = 0;
        while (true){
            int a = sc.nextInt();
            if (a==-1){
                System.out.println(sum/count);
                return;
            }
            count++;
            sum+=a;

        }
    }
}


  /*
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
           double sum =0;
        int count = 0;
        while (true){
            int a = Integer.parseInt(reader.readLine());
            if(a==-1){
                System.out.println(sum/count);
                return;

            }
            count++;
            sum +=a;
        }







        //напишите тут ваш код
    }
}
   */



