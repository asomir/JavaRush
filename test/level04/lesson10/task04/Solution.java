package com.javarush.test.level04.lesson10.task04;

/* S-квадрат
Вывести на экран квадрат из 10х10 букв S используя цикл while.
Буквы в каждой строке не разделять.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код


        int j = 10;
        int i = 9;
        String a = "S";
        while (j >= 1)

        {

            while (i >= 1)
            {

                System.out.print(a);
                i--;
            }
            System.out.println(a);
            j--;
            i = 9;
        }

    }
}
