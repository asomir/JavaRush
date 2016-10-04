package com.javarush.test.level15.lesson04.task02;

/* ООП - Перегрузка
Перегрузите метод printMatrix 8 различными способами. В итоге должно получиться 10 различных методов printMatrix.
*/

public class Solution {
    public static void main(String[] args) {
        printMatrix(2, 3, "8");
    }

    public static void printMatrix(int m, int n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(short m, int n, String value) {
        System.out.println("Вариант 1");
    }

    public static void printMatrix(int m, short n, String value) {
        System.out.println("Вариант 2");
    }

    public static void printMatrix(double m, short n, String value) {
        System.out.println("Вариант 3");
    }

    public static void printMatrix(double m, int n, String value) {
        System.out.println("Вариант 4");
    }

    public static void printMatrix(short m, double n, String value) {
        System.out.println("Вариант 5");
    }
    public static void printMatrix(int m, double n, String value) {
        System.out.println("Вариант 6");
    }

    public static void printMatrix(Integer m, double n, String value) {
        System.out.println("Вариант 7");
    }

    public static void printMatrix(double m, Integer n, String value) {
        System.out.println("Вариант 8");
    }


    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }
}
