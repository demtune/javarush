package com.javarush.task.task07.task0716;

import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {

        ArrayList<String > result = new ArrayList<>();
        boolean R;
        boolean L;
        for (String s :strings){
            R = s.contains("р");
            L = s.contains("л");


            if ((R && L) || (!R && !L)){
                result.add(s);
            }
            else if (L){
                result.add(s);
                result.add(s);
        }
        }
        return result;
    }
}