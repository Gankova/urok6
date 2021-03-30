package com.company.Test;

// import импортирует или подключает классы одного пакета в другой
// Если в конце import.com.company. стоит * указывает на то, что нужно импортировать
// все классы, принадлежащие данному пакету
import com.company.Car;

public class Test {
    public void test(){
        Car car = new Car ();
        car.color = "black";
    }
}
