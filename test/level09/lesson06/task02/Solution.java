package com.javarush.test.level09.lesson06.task02;

/* Исключение при работе со строками
Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
String s = null;
String m = s.toLowerCase();
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

        catch (NullPointerException e)
        {

            System.out.println(e);

        }


    }
    public static String method1()

    {

        String s = null;
        String m = s.toLowerCase();
        System.out.println(m);
        return m;

        //напишите тут ваш код
    }
}
