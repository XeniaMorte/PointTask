package com.example.taskclass;

import com.example.taskclass.util.PointUtil;
import com.example.taskclass.util.Printable;

import java.util.Map;
import java.util.UUID;

public class Point implements Printable {

    public static double DEFAULT_POS = 0.0;

    protected UUID id;
    protected String name;
    protected double coordinateX;

    public Point() {
        this(UUID.randomUUID().toString());
        name = id.toString();
    }

    public Point(String name) {
        this(name, UUID.randomUUID(), DEFAULT_POS);
    }

    public Point(String name, UUID id, double coordinateX) {
        this.coordinateX = coordinateX;
        this.name = name;
        this.id = id;
    }

    public double getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(double coordinateX) {
        this.coordinateX = coordinateX;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "INFO: " + getCoordinateX() + " " + getName() + " " + getId();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Point point) {
            return point.id == this.id;
        }
        return false;
    }
    @Override
    public void printInfo() {
        System.out.println(this);
    }

    public double calculateDistance(Point a) {
        return PointUtil.calculateDistance1D(a.coordinateX, this.coordinateX);
    }

    public void editPointOffset(Map<Character, Double> map) {
        this.coordinateX += map.getOrDefault('x', this.coordinateX);
    }

    public void editCoordinatePoint(Map<Character, Double> map) {
        this.coordinateX = map.getOrDefault('x', this.coordinateX);
    }

    public void getQuarter() {
        throw new UnsupportedOperationException(" метод не поддерживается для этого типа точки ");
    }
}

//1.Подумать какие конструкторы нужны и создать их.+
//        2.Дописать метод который находит дистанцию между двумя точками (передают две точки)+
//        3. Написать метод, который меняет координаты точки на переданное смещение.+
//        4. Написать метод, который меняет координаты точки на переданные.+
//        5. Написать метод, который вычисляет в какой четвертом находится точка+
//        6. Подумать как реализовать присвоение айди+
//        7. Создать классы наследники (двухмерная и трехмерная точка). Переопределить методы, если возможно. Подумать, какие поля надо добавить-
//        8. Создать тестовый класс, в котором протестировать функционал-
//Написать классы для отрезков (одномерный , двумерных , трехмерный)
//9. Реализовать несколько конструкторов: один по умолчанию, когда ничего не передается, второй - передается 2 точки
//        10. Реализовать метод, который будет возвращать длину отрезка (используя методы нахождения расстояния между точками)
//        11. Реализовать метод по выводу информации об отрезках
