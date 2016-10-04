package com.javarush.test.level05.lesson05.task04;

/* Создать три объекта типа Cat
В методе main создать три объекта типа Cat и заполнить их данными.
Использовать класс Cat из первой задачи. Класс Cat создавать не надо.
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        String name;
        int age, weight, strength;
        Cat cat1 = new Cat("Vaska", 5, 35, 87);
        Cat cat2 = new Cat("Petka", 6, 37, 88);
        Cat cat3 = new Cat("Alfa", 8, 47, 73);
       /* cat1.name = "Vaska";
        cat1.age = 5;
        cat1.weight = 35;
        cat1.strength = 87;


        cat2.name = "Petka";
        cat2.age = 7;
        cat2.weight = 37;
        cat2.strength = 83;


        cat3.name = "Valka";
        cat3.age = 6;
        cat3.weight = 36;
        cat3.strength = 88; */

    }

    public static class Cat {

        public static int count = 0;
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            count++;

            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}
