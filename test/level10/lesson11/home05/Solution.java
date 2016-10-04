package com.javarush.test.level10.lesson11.home05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Количество букв
Ввести с клавиатуры 10 строчек и подсчитать в них количество различных букв (для 33 букв алфавита).  Вывести результат на экран.
Пример вывода:
а 5
б 8
в 3
г 7
д 0
…
я 9
*/

public class Solution
{
    public static void main(String[] args)  throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //String sall = reader.readLine();
       /* String s1 = reader.readLine();
        String s2 = reader.readLine();
        String s3 = reader.readLine();
        String s4 = reader.readLine();
        String s5 = reader.readLine();
        String s6 = reader.readLine();
        String s7 = reader.readLine();
        String s8 = reader.readLine();
        String s9 = reader.readLine();
        String s10 = reader.readLine();

        String sall = s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10;

        System.out.println(sall); */


        //алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++)
        {
            alphabet.add(abcArray[i]);
        }

        //ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++)
        {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }


        //напишите тут ваш код
        int[] count = new int[33];
        for (int i = 0; i < list.size(); i++)
        {
            char[] ch = list.get(i).toCharArray();
            for (int j = 0; j < ch.length; j++)
            {

               int index = alphabet.indexOf(ch[j]);
                count[index]++;
            }


        }
        for (int i = 0; i < count.length; i++)
        {
            System.out.println(alphabet.get(i) + " " + count[i]);
        }
    }

}
