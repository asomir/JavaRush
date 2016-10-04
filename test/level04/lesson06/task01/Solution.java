package com.javarush.test.level04.lesson06.task01;

/* Минимум двух чисел
Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        // BufferedInputStream reader = new BufferedInputStream(new InputStreamReader(System.in));
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        String b = reader.readLine();
        int A = Integer.parseInt(a);
        int B = Integer.parseInt(b);
        System.out.println(min(A, B));

    }

    public static int min(int A, int B)
    {
        int m;
        if (A < B)
            m = A;
        else
            m = B;
        return m;
    }
}