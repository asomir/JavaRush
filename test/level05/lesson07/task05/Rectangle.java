package com.javarush.test.level05.lesson07.task05;

/* Создать класс прямоугольник (Rectangle)
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (левая координата, верхняя, ширина и высота). Создать для него как можно больше методов initialize(…)
Примеры:
-	заданы 4 параметра: left, top, width, height
-	ширина/высота не задана (оба равны 0)
-	высота не задана (равно ширине) создаём квадрат
-	создаём копию другого прямоугольника (он и передаётся в параметрах)
*/

public class Rectangle
{
    //напишите тут ваш код
    static int top = 5;
    static int left = 1;
    static int width = 4;
    static int height = 6;
    public void initialize(int top, int left, int width, int height)
    {
        this.top = 6;
        this.left = 2;
        this.width = 4;
        this.height = 7;
    }
    public void initialize(int top, int left)
    {
        this.top = top;
        this.left = left;
        //this.width = width;
        //this.height = height;
    }
    public void initialize(int top, int left, int width)
    {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = width;
    }
    public void initialize(Rectangle rect)
    {
        rect = this;
    }


}
