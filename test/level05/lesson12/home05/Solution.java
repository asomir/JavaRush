package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        for (int i = 0;  i != -1; i++)
        {
            String sb = reader.readLine();
            String e = sb;
            String g = "сумма";
            if(e.equals(g))
            {

                break;


            }
            int a = Integer.parseInt(sb);
            sum = sum + a;

        }
        System.out.println(sum);
    }
}
