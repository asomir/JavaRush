package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {
        double  x = 2400;
        for (int i = 0; i < 32; i++)
        {
            x = (x + ( x / 10)) + 2400;
            System.out.println(x);
        }
        System.out.println(x);
    }

}