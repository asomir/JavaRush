package com.javarush.test.level04.lesson16.home03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.  -1 должно учитываться в сумме.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        for (int i = 0;  i != -1; i++)
        {
            String sb = reader.readLine();
            int a = Integer.parseInt(sb);
            if(a == (-1))
            {
                sum = sum + a;

                break;


            }

            sum = sum + a;

        }
        System.out.println(sum);
    }

}
