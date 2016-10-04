package com.javarush.test.level06.lesson11.home02;

import java.util.ArrayList;

/* Статические коты
1. В классе Cat добавь public статическую переменную cats (ArrayList<Cat>).
2. Пусть при каждом создании кота (нового объекта Cat) в переменную cats добавляется этот новый кот. Создать 10 объектов Cat.
3. Метод printCats должен выводить всех котов на экран. Нужно использовать переменную cats.
*/

public class Cat

{

  //  public String name;
    public Cat()
    {
        cats.add(this);
    }
    //напишите тут ваш код

    public static ArrayList<Cat> cats = new ArrayList<Cat>();
    public static void main(String[] args) {
        //Создай тут 10 котов
      for (int i = 0; i < 10; i++)
        {
            new Cat();
        }

      /*  Cat cat1 = new Cat();
        cats.add(cat1);
        Cat cat2 = new Cat();
        cats.add(cat2);
        Cat cat3 = new Cat();
        cats.add(cat3);
        Cat cat4 = new Cat();
        cats.add(cat4);
        Cat cat5 = new Cat();
        cats.add(cat5);
        Cat cat6 = new Cat();
        cats.add(cat6);
        Cat cat7 = new Cat();
        cats.add(cat7);
        Cat cat8 = new Cat();
        cats.add(cat8);
        Cat cat9 = new Cat();
        cats.add(cat9);
        Cat cat10 = new Cat();
        cats.add(cat10);
        */

        printCats();
    }

    public static void printCats() {
        //Добавь свой код для пункта 3 тут
      //  for(i: cats.size()) cats.size+=1;

            System.out.println(cats);

    }
}
