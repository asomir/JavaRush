package com.javarush.test.level08.lesson11.home05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/* Мама Мыла Раму. Теперь с большой буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
  мама     мыла раму.

Пример вывода:
  Мама     Мыла Раму.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        StringTokenizer st = new StringTokenizer(s, " \t\n\r+*-/()._+=@#$%^:;'&?!<>|\\{},[]~", true); //раскладываем строку на отдельные слова
        //если нам встретятся спец символы, то он их воспримет как часть отдельного слова, аккуратно переписывая с оригинала
        StringBuilder predlogenie = new StringBuilder(); //в цикле прямую конкатенацию использовать грешно, берём самый быстрый метод склеивания строк

        while(st.hasMoreTokens()) //цикл, который работает до тех пор, пока в строке есть ещё слова
        {
            String str =  st.nextToken(); //берём очередное слово и присваиваем её переменной str
            String s2 = firstUpperCase(str); //вызываем метод firstUpperCase для переменной str, который делает первую строчку заглавной
            predlogenie.append(s2); //склеиваем строки аналогично predlogenie += s2

        }
        System.out.println(predlogenie); //по окончанию цикла распечатываем строку со взрослыми первыми буквами

    }
    private static String firstUpperCase(String word) //объявляем метод firstUpperCase, который будет нам делать хорошо
    {if(word == null || word.isEmpty()) return word; //проверяем, что вводит пользователь, если ничего не ввёл, то отправляем человека отдохнуть, спи, программка
        return word.substring(0, 1).toUpperCase() + word.substring(1); //а тем временем мы возвращаем первую букву слова, которую делаем взрослой и в конец слова дописываем всё
        // , что было после первой буквы
    }

}