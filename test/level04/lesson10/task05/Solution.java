package com.javarush.test.level04.lesson10.task05;

/* Таблица умножения
Вывести на экран таблицу умножения 10х10 используя цикл while.
Числа разделить пробелом.
1 2 3 4 5 6 7 8 9 10
2 4 6 8 10 12 14 16 18 20
...
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        int i = 1;
        while (i <= 10)
        {
            System.out.print(i + " ");
            System.out.print(2 * i + " ");
            System.out.print(3 * i + " ");
            System.out.print(4 * i + " ");
            System.out.print(5 * i + " ");
            System.out.print(6 * i + " ");
            System.out.print(7 * i + " ");
            System.out.print(8 * i + " ");
            System.out.print(9 * i + " ");
            System.out.println(10 * i + " ");
            i++;
        }

    }
}
