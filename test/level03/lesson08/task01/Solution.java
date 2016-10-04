package com.javarush.test.level03.lesson08.task01;

/* Как захватить мир
Ввести с клавиатуры число и имя, вывести на экран строку:
«имя» захватит мир через «число» лет. Му-ха-ха!
Пример: Вася захватит мир через 8 лет. Му-ха-ха!

Последовательность вводимых данных имеет большое значение.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
       /* BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sYear = reader.readLine();
        String name = reader.readLine();
        int nYear = Integer.parseInt(sYear);
        System.out.println(name + " захватит мир через " + nYear + " лет. Му-ха-ха!"); */

        int p = 1;
        for (int i = 1; i <= 10 ; i++)
        {
            for (int j = 1; j <= 10 ; j++)
            {
                p = i * j;
                System.out.print(p + " ");

            }
            System.out.println();
        }


    }
}