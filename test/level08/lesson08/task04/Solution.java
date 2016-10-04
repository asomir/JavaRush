package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: "фамилия" - "дата рождения".
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Сталлоне", new Date("AUGUST 1 1980"));
        map.put("Середа", new Date("JUNE 1 1980"));
        map.put("Сидоренко", new Date("JULY 1 1980"));
        map.put("пертов", new Date(1950, 4, 5));
        map.put("Сало", new Date(1950, 8, 5));
        map.put("Иванов", new Date(1950, 11, 5));
        map.put("Сидоренко1", new Date("SEPTEMBER 1 1980"));
        map.put("Сидоренко2", new Date("OCTOBER 1 1980"));
        map.put("Сидоренко3", new Date("NOVEMBER 1 1980"));
        map.put("Сидоренко4", new Date("DECEMBER 1 1980"));

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()){
            Map.Entry<String, Date> item = iterator.next();
            int month = item.getValue().getMonth();

            if (month > 4 && month < 8)
                iterator.remove();
        }

    }


}