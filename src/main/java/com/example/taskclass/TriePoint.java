package com.example.taskclass;

import com.example.taskclass.util.PointUtil;

import java.util.Map;
import java.util.UUID;

public class TriePoint extends DoeblePoint {

    protected double coordinateZ;

    public TriePoint() {
        super();
        this.coordinateZ = DEFAULT_POS;
    }

    public TriePoint(String name) {
        super(name);
        this.coordinateZ = DEFAULT_POS;
    }

    public TriePoint(String name, UUID id, double coordinateX, double coordinateY, double coordinateZ) {
        super(name, id, coordinateX, coordinateY);
        this.coordinateZ = coordinateZ;
    }

    public double getCoordinateZ() {
        return coordinateZ;
    }

    public void setCoordinateZ(double coordinateZ) {
        this.coordinateZ = coordinateZ;
    }

    @Override
    public double calculateDistance(Point a) {
        if (a instanceof TriePoint point) {
            return PointUtil.calculateDistance3D(this, point);
        }
        throw new IllegalArgumentException("Point isn't instance of TriePoint");
    }

    @Override
    public void editPointOffset(Map<Character, Double> map) {
        super.editPointOffset(map);
        this.coordinateZ += map.getOrDefault('z', this.coordinateZ);
    }

    @Override
    public void editCoordinatePoint(Map<Character, Double> map) {
        super.editCoordinatePoint(map);
        this.coordinateY = map.getOrDefault('z', this.coordinateZ);
    }

    @Override
    public void getQuarter() {
        throw new UnsupportedOperationException(" метод не поддерживается для этого типа точки ");
    }
}
