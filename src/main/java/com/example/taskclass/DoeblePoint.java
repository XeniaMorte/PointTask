package com.example.taskclass;

import com.example.taskclass.util.PointUtil;

import java.awt.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class DoeblePoint extends Point {

    protected double coordinateY;

    public DoeblePoint() {
        super();
        this.coordinateY = DEFAULT_POS;
    }

    public DoeblePoint(String name) {
        super(name);
        this.coordinateY = DEFAULT_POS;
    }

    public DoeblePoint(String name, UUID id, double coordinateX, double coordinateY) {
        super(name, id, coordinateX);
        this.coordinateY = coordinateY;
    }

    public double getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(double coordinateY) {
        this.coordinateY = coordinateY;
    }

    @Override
    public double calculateDistance(Point a) {
        if (a instanceof DoeblePoint doeblePoint) {
            return PointUtil.calculateDistance2D(this, doeblePoint);
        }
        throw new IllegalArgumentException("Point isn't instance of DoueblePoint");
    }

    @Override
    public void editPointOffset(Map<Character, Double> map) {
        super.editPointOffset(map);
        this.coordinateY += map.getOrDefault('y', this.coordinateY);
    }

    @Override
    public void editCoordinatePoint(Map<Character, Double> map) {
        super.editCoordinatePoint(map);
        this.coordinateY = map.getOrDefault('y', this.coordinateY);
    }

    @Override
    public void getQuarter() {
        if (getCoordinateX() > 0 && getCoordinateY() > 0) {
            System.out.println("Точка находится в 1 четверти");
        } else if (getCoordinateX() < 0 && getCoordinateY() > 0) {
            System.out.println("Точка находится в 2 четверти");
        } else if (getCoordinateX() < 0 && getCoordinateY() < 0) {
            System.out.println("Точка находится в 3 четверти");
        } else if (getCoordinateX() > 0 && getCoordinateY() < 0) {
            System.out.println("Точка находится в 4 четверти");
        } else {
            System.out.println("Точка не принадлежит четвертям");
        }
    }
}