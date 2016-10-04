package com.javarush.test.level05.lesson07.task01;

/* Создать класс Friend
Создать класс Friend (друг) с тремя инициализаторами (тремя методами initialize):
- Имя
- Имя, возраст
- Имя, возраст, пол
*/

public class Friend
{
    //напишите тут ваш код
    private String name = null;
    private int age;
    private String genre;
    public void initialize(String name)
    {
        this.name = name;
    }

    public void initialize(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    // Файл filename будет находиться в той же директории, что и file.
    public void initialize(String name, int age, String genre )
    {
        this.name = name;
        this.age = age;
        this.genre = genre;
    }

}
