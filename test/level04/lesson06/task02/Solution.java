package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        String b = reader.readLine();
        String c = reader.readLine();
        String d = reader.readLine();
        int A = Integer.parseInt(a);
        int B = Integer.parseInt(b);
        int C = Integer.parseInt(c);
        int D = Integer.parseInt(d);
        System.out.println(max(A, B, C, D));

    }

    public static int max(int A, int B, int C, int D)
    {
        int m, m1, m2;
        if (A >= B)
            m1 = A;
        else
            m1 = B;
        if (C >= D)
            m2 = C;
        else m2 = D;
        if (m1 >= m2)
            m = m1;
        else
            m = m2;
        return m;
    }
}
