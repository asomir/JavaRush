package com.javarush.test.level09.lesson06.task01;

/* Исключение при работе с числами
Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
int a = 42 / 0;
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        try
        {

            method1();
        }
        catch (Exception e)
        {
            String s = e.getMessage();
            System.out.println(e);
        }
    }

    public static void method1()
    {

        int a;
        int b = 40;
        int c = 0;
        a = b / c;
        System.out.println(a);

        //напишите тут ваш код


    }
}
