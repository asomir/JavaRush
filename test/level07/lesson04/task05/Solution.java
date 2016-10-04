package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        int[] masB = new int[20];
        int[] mas1 = new int[10];
        int[] mas2 = new int[10];
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++)
        {
            masB[i] = Integer.parseInt(reader.readLine());
            if(i <= 9)
                mas1[i] = masB[i];
            else
            {
                int a = i - 10;
                mas2[a] = masB[i];
            }

        }
        for (int j = 0; j < 10; j++)
        {
            System.out.println(mas2[j]);
        }
    }
}
