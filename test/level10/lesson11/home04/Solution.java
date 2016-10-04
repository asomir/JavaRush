package com.javarush.test.level10.lesson11.home04;

/* Большая зарплата
Вывести на экран надпись «Я не хочу изучать Java, я хочу большую зарплату» 40 раз по образцу.
Образец:
Я не хочу изучать Java, я хочу большую зарплату
 не хочу изучать Java, я хочу большую зарплату
не хочу изучать Java, я хочу большую зарплату
е хочу изучать Java, я хочу большую зарплату
 хочу изучать Java, я хочу большую зарплату
хочу изучать Java, я хочу большую зарплату
…
*/

import java.util.ArrayList;
import java.util.Arrays;

public class Solution
{
    public static void main(String[] args)
    {
        String s = "Я не хочу изучать Java, я хочу большую зарплату";

        //напишите тут ваш код
       /* ArrayList<String> array = new ArrayList<String>();
        array.add(s);

        System.out.println(array.size());
                   for (int j = 0; j < ch.length; j++)
            {
                array.add(ch{j])
            }
             char []ch = s.toCharArray();
        ArrayList<String> array = new ArrayList<String>();
        for (int j = 0; j < ch.length; j++)
        {
            array.add(String.valueOf(ch[j]));
        }

*/
        ArrayList<String>array = new ArrayList<String>(Arrays.asList(s.split("(?<=\\G.{1})")));
        for (int i = 0; i < 40; i++)
        {
            for (String item: array)
            {
                System.out.print(item);

            }
            array.remove(0);
            System.out.println();
        }


    }

}
