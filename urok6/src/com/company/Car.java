package com.company;

// название класса должно совпадать с именем файла!
// Класс - это шаблон для создания объекта
// у класса java  может быть три модификатора доступа
// public - класс виден как внутри пакета, которому принадлежит, так и вне этого пакета
// private  классы нельзя объявлять на уровне файла
// можно объявлять, как внутри других классов, так и внутри методов
// Областm видимости такого класса - ближайшие фигурные скобки {}
// Для радительского класса все свойства иннер класса являются открытыми

public class Car {

    // область видимости класса Engine - только внутри класса Car {}
    // inner - класс (внутренний класс)
    private class Engine {
        public float power;
    }

    // в java полям класса можно создать 4 модификатора доступа
    // public, private, protected, (default, package level)

    // public  - поле доступно для обращения вне методов класса
    // объект созданный через паблик в другом пакете, методе, доступен
    public String color;// переменная внутри класса - свойство

    //private - доступен только внутри методов данного класа
    private int maxSpeed;

    //protected - для классов в одном пакете = public
    // для классов из других пакетов = private
    protected float tankVolume;

    //модификатор доступа по умолчанию (пакетный модификатор доступа)для классов в одном пакете = public
    // для классов из других пакетов = private
    int doorsCount;


    public void drive () {
        System.out.println("Car is driving");
    }
    public void stop () {
        // создать Example  только внутри метода stop
        class Example {
            private int test;
            public void say(){
                System.out.println("hello!");
            }
        }
        Example e = new Example();
        e.test =12;
        e.say();

        System.out.println("Car was stopped");
    }

    // геттер для поля maxSeed;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    //сеттер для поля maxSpeed
    public void setMaxSpeed(int speed) {
        if (speed <= 0 || speed > 300) {
            //ошибка.
            System.out.println("incorrect spedd");
            return;
        }
        maxSpeed = speed;
    }
}
