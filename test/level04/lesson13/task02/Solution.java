package com.javarush.test.level04.lesson13.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Рисуем прямоугольник
Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
Пример: m=2, n=4
8888
8888
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String M = reader.readLine();
        String N = reader.readLine();
        String a = "8";
        int n = Integer.parseInt(N);
        int m = Integer.parseInt(M);
        for (int i = 1; i <= n; n++)
        {
            for (int j = 1; i <= m; i++)
            {
                System.out.print(a);
            }
            System.out.println();
        }


    }
}
