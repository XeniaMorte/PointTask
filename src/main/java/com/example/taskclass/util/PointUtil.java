package com.example.taskclass.util;

import com.example.taskclass.DoeblePoint;
import com.example.taskclass.Point;
import com.example.taskclass.TriePoint;

import static java.lang.Math.*;

public final class PointUtil {

    private PointUtil() {}

    public static double calculateDistance1D(double coordinateX, double coordinateX2) {
        return abs(coordinateX - coordinateX2);
    }

    public static double calculateDistance(double a, double b) {
        return abs(a - b);
    }

    public static double calculateDistance1D(Point a, Point b) {
        double distance = calculateDistance(a.getCoordinateX(),  b.getCoordinateX());
        printInfo(a.getName(), b.getName(), distance);
        return distance;
    }

    public static double calculateDistance2D(DoeblePoint a, DoeblePoint b) {
        double distanceX = calculateDistance(a.getCoordinateX(), b.getCoordinateX());
        double distanceY = calculateDistance(a.getCoordinateY(), b.getCoordinateY());
        double distance = sqrt(pow(distanceX, 2) + pow(distanceY, 2));
        printInfo(a.getName(), b.getName(), distance);
        return distance;
    }

    public static double calculateDistance3D(TriePoint a, TriePoint b) {
        double distanceX = calculateDistance(a.getCoordinateX(), b.getCoordinateX());
        double distanceY = calculateDistance(a.getCoordinateY(), b.getCoordinateY());
        double distanceZ = calculateDistance(a.getCoordinateZ(), b.getCoordinateZ());
        double distance = sqrt(pow(distanceX, 2) + pow(distanceY, 2) + pow(distanceZ, 2));
        printInfo(a.getName(), b.getName(), distance);
        return distance;
    }

    private static void printInfo(String name1, String name2, double distance) {
        System.out.printf("Дистанция между точками %s и %s = %.2f%n", name1, name2, distance);
    }
}
