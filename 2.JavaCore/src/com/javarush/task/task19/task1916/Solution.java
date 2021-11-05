package com.javarush.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();

        List<String> fileList1 = readFile(file1);
        List<String> fileList2 = readFile(file2);

        int oldCount = 0;
        int newCount = 0;

        while (oldCount < fileList1.size() && newCount < fileList2.size()) {
            if (fileList1.get(oldCount).equals(fileList2.get(newCount))) {
                lines.add(new LineItem(Type.SAME, fileList1.get(oldCount)));
                oldCount++;
                newCount++;
            } else if (oldCount + 1 < fileList1.size() && fileList1.get(oldCount + 1).equals(fileList2.get(newCount))) {
                lines.add(new LineItem(Type.REMOVED, fileList1.get(oldCount)));
                oldCount++;
            } else if (newCount + 1 < fileList2.size() && fileList1.get(oldCount).equals(fileList2.get(newCount + 1))) {
                lines.add(new LineItem(Type.ADDED, fileList2.get(newCount)));
                newCount++;
            }
        }

        while (oldCount < fileList1.size()) {
            lines.add(new LineItem(Type.REMOVED, fileList1.get(oldCount)));
            oldCount++;
        }
        while (newCount < fileList2.size()) {
            lines.add(new LineItem(Type.ADDED, fileList2.get(newCount)));
            newCount++;
        }
    }

    static List<String> readFile(String fileName) throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        ArrayList<String> list = new ArrayList<>();
        String line;

        while ((line = reader.readLine()) != null) {
            list.add(line);
        }
        reader.close();
        return list;
    }

    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
