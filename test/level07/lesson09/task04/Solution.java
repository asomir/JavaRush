package com.javarush.test.level07.lesson09.task04;

import java.util.ArrayList;

/* Буква «р» и буква «л»
1. Создай список слов, заполни его самостоятельно.
2. Метод fix должен:
2.1. удалять из списка строк все слова, содержащие букву «р»
2.2. удваивать все слова содержащие букву «л».
2.3. если слово содержит и букву «р» и букву «л», то оставить это слово без изменений.
2.4. с другими словами ничего не делать.
Пример:
роза
лира
лоза
Выходные данные:
лира
лоза
лоза
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
       /* for(int i = 0; i < list.size(); i++)
        {
            String str = bis.readLine();
            list.add(str);
        } */
        list.add("роза"); //0
        list.add("лира"); //1
        list.add("лоза"); //2
        list.add("коза");
        list.add("юла");
        list.add("брат");
        list.add("братан");
        list.add("братишка");
        list.add("спайс");
        list.add("отпусти");
        list.add("Стас Михайлов");
        list.add("бутырка");
        list.add("воровайки");
        list.add("мент");
        list.add("зингер");
        list.add("воровской прогон");
        list.add("по понятиям");
        list.add("обоснуй");
        list.add("мурчишь");
        list.add("параша");
        list.add("гонишь");
        list.add("за базар");
        list.add("малява");
        list.add("ксива");
        list.add("расклад");
        list.add("не очко обычно губит");
        list.add("централ");
        list.add("зеленый прокурор");
        list = fix(list);

        for (String s: list)
        {
            System.out.println(s);
        }
    }

    public static ArrayList fix(ArrayList<String> list) {
        for(int i = 0; i < list.size();)
        {
            if(list.get(i).contains("р") && list.get(i).contains("л")){
                i++;
            }
            else if(list.get(i).contains("л")){
                list.add(i, list.get(i));
                i+=2;
            }
            else if(list.get(i).contains("р")){
                list.remove(i);

            }
            else i++;

        }
        return list;
    }
}
