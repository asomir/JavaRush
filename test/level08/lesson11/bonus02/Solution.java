package com.javarush.test.level08.lesson11.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* Нужно добавить в программу новую функциональность
Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
Новая задача: Программа должна работать не с номерами домов, а с городами:
Пример ввода:
Москва
Ивановы
Киев
Петровы
Лондон
Абрамовичи

Лондон

Пример вывода:
Абрамовичи
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //list of addresses
        HashMap<String, String> addresses = new HashMap<String, String>();
        while (true)
        {
            String family = reader.readLine();
            if (family.isEmpty()) break;
            String town = reader.readLine();
            if (town.isEmpty()) break;


            addresses.put(family, town);
        }

        String cityes = reader.readLine();
        for(Map.Entry<String, String> pair: addresses.entrySet())
        {
            String city = pair.getKey();

            if(cityes.equals(city))
            {
                String family = pair.getValue();
                System.out.println(family);
            }
        }




    }
}
