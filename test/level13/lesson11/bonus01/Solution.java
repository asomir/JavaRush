package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String FileName = reader.readLine();
        ArrayList<Integer> list=new ArrayList<Integer>();
        Scanner in = new Scanner(new File(FileName));
        while (in.hasNext())
            list.add(in.nextInt());
        Collections.sort(list);
        for (int i=0; i < list.size(); i++)
        {
            if (list.get(i) % 2 == 0)
                System.out.println(list.get(i));

        }

    }
}
