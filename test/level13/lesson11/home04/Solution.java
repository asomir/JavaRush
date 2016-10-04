package com.javarush.test.level13.lesson11.home04;

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой стороки.
*/

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String FileName = br.readLine();
        FileWriter in = new FileWriter(FileName);
        ArrayList<String> array = new ArrayList<String>();
        while (true)
        {
            String str = br.readLine();
            array.add(str);
            if(str.equals("exit"))
            {
                for(String strings: array)
                {
                    in.write(strings);
                } break;
            }  array.add("\n");



        } in.close();








    }


}
