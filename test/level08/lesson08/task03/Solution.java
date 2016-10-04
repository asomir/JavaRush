package com.javarush.test.level08.lesson08.task03;


import java.util.HashMap;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static void main(String[] args)
    {
        HashMap<String, String> map = createMap();
        String s = "family2";
        String s1 = "name2";
        int x = getCountTheSameLastName(map, s);
        int a = getCountTheSameFirstName(map, s1);
        System.out.println("LastName " + x);
        System.out.println("Name " + a);


    }



    public static HashMap<String, String> createMap()
    {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<String, String>();
        map.put("family","name");
        map.put("family1","name");
        map.put("family2","name");
        map.put("family7","name1");
        map.put("family3","name2");
        map.put("family4","name2");
        map.put("family6","name2");
        map.put("family8","name2");
        map.put("family9","name2");
        map.put("family5","name3");
        return (HashMap<String, String>) map;

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        //напишите тут ваш код
        // Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        int nameValue = 0;
        for (Map.Entry<String, String> pair : map.entrySet())
        {

            String key = pair.getKey();                   //ключ
            String value = pair.getValue();                  //значение
            if (value.equals(name))  nameValue++;
        }
        return nameValue;


    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        //напишите тут ваш код
        int LastNameValue = 0;
        for (Map.Entry<String, String> pair : map.entrySet())
        {

            String key = pair.getKey();                   //ключ
            String value = pair.getValue();                  //значение
            if (key.equals(lastName)) LastNameValue++;
        }
        return LastNameValue;

    }
}
