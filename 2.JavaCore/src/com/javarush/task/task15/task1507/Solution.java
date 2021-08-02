package com.javarush.task.task15.task1507;

/* 
ООП - Перегрузка
*/

public class Solution {
    public static void main(String[] args) {
        printMatrix(2, 3, "8");
    }

    public static void printMatrix(int m, int n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }

    public static void printMatrix(int m, int n, Double value) {
        System.out.println("Заполняем объектами Double");
        printMatrix(m, n, (Double) value);
    }

    public static void printMatrix(int m, int n, Float value) {
        System.out.println("Заполняем объектами Float");
        printMatrix(m, n, (Float) value);
    }

    public static void printMatrix(int m, int n, Short value) {
        System.out.println("Заполняем объектами Short");
        printMatrix(m, n, (Short) value);
    }

    public static void printMatrix(int m, int n, Character value) {
        System.out.println("Заполняем объектами Character");
        printMatrix(m, n, (Character) value);
    }

    public static void printMatrix(int m, int n, char value) {
        System.out.println("Заполняем объектами char");
        printMatrix(m, n, (char) value);
    }

    public static void printMatrix(int m, int n, byte value) {
        System.out.println("Заполняем объектами byte");
        printMatrix(m, n, (byte) value);
    }

    public static void printMatrix(int m, int n, float value) {
        System.out.println("Заполняем объектами float");
        printMatrix(m, n, (float) value);
    }

    public static void printMatrix(int m, int n, Byte value) {
        System.out.println("Заполняем объектами Byte");
        printMatrix(m, n, (Byte) value);
    }

}
