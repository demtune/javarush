package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();

        String paramString = url.substring(url.lastIndexOf("?") + 1);
        String[] param = paramString.split("&");
        String value = null;

        StringBuilder stringBuilder = new StringBuilder();
        for (String s : param) {
            String[] paramAndValue = s.split("=");
            stringBuilder.append(paramAndValue[0]);
            stringBuilder.append(" ");

            if (paramAndValue[0].equals("obj")) {
                value = paramAndValue[1];
            }
        }
        System.out.println(stringBuilder.toString().trim());

        if (value != null) {
            try {
                alert(Double.parseDouble(value));

            } catch (NumberFormatException e) {
                alert(value);
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}


