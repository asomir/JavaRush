package com.javarush.test.level13.lesson02.task07;

/* Параметризованый интерфейс
В классе StringObject реализуй интерфейс SimpleObject с параметром типа String.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
    }

    interface SimpleObject<T>
    {
        SimpleObject<T> getInstance();
    }

    class StringObject<S> implements SimpleObject<String>//допишите здесь ваш код
    {
        @Override
        public SimpleObject<String> getInstance()
        {
            SimpleObject<String> s = new StringObject<String>();
            return s;


        }
    }
}
