package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) {

        String fileName = args[0];
        ArrayList<String> content = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.add(line);
            }

            for (String s : content) {
                String[] split = s.split(" ");
                StringBuffer name = new StringBuffer();

                for (int i = 0; i < split.length - 3; i++) {
                    name.append(split[i]).append(" ");      //все что меньше этой длины массива будет именем
                }

                int year = Integer.parseInt(split[split.length - 1]);
                int month = Integer.parseInt(split[split.length - 2]) - 1; //Январь == 0
                int day = Integer.parseInt(split[split.length - 3]);

                Calendar birthDay = new GregorianCalendar(year, month, day);

                PEOPLE.add(new Person(name.toString().trim(), birthDay.getTime()));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
