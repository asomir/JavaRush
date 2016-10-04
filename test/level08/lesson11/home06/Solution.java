package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;
import java.util.Iterator;

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        Human son1 = new Human("Andy", true, 14, new ArrayList<Human>());
        Human son2 = new Human("Paul", true, 11, new ArrayList<Human>());
        Human daughter = new Human("Victoria", false, 18, new ArrayList<Human>());
        ArrayList<Human> ch = new ArrayList<Human>();
        ch.add(son1);
        ch.add(son2);
        ch.add(daughter);

        Human father = new Human("Aleksey", true, 44, ch);
        Human mother = new Human("Konstancia", false, 38, ch);
        ArrayList<Human> parrent1 = new ArrayList<Human>();
        ArrayList<Human> parrent2 = new ArrayList<Human>();
        parrent1.add(father);
        parrent2.add(mother);

        Human gfather1 = new Human("Ivan", true, 64, parrent1);
        Human gmother1 = new Human("Maria", false, 64, parrent1);
        ArrayList<Human> gparrent1 = new ArrayList<Human>();
        gparrent1.add(gfather1);
        gparrent1.add(gmother1);

        Human gfather2 = new Human("Mike", true, 65, parrent2);
        Human gmother2 = new Human("Anna", false, 65, parrent2);
        ArrayList<Human> gparrent2 = new ArrayList<Human>();
        gparrent2.add(gfather2);
        gparrent2.add(gmother2);

        ArrayList<Human> family = new ArrayList<Human>();
        family.addAll(ch);
        family.addAll(parrent1);
        family.addAll(parrent2);
        family.addAll(gparrent1);
        family.addAll(gparrent2);
        Iterator<Human> iterator = family.iterator();

        while(iterator.hasNext())
        {
            System.out.println(iterator.next().toString());
        }



    }

    public static class Human
    {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;
        public Human(String name, boolean sex, int age, ArrayList<Human> children)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
