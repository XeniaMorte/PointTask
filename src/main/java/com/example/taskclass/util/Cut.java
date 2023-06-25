package com.example.taskclass.util;

import com.example.taskclass.Point;

import java.util.UUID;

public class Cut {
    protected String name;
   private Point one;
   private Point two;
    protected UUID id;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public Point getOne() {
        return one;
    }

    public void setOne(Point one) {
        this.one = one;
    }

    public Point getTwo() {
        return two;
    }

    public void setTwo(Point two) {
        this.two = two;
    }


    public  Cut(){
        this.id=(UUID.randomUUID());
        name = id.toString();

    }
    public  Cut( Point one, Point two){
        this.id=(UUID.randomUUID());
        name = id.toString();
    }
    public static double segmentLength( Point one, Point two){
        return one.calculateDistance(two);
    }

    public void printInfoAboutCut() {
        System.out.println( "Отрезок: "  + " " + getName() + " " + getId()+"\n"+" состоит из точек "+" "+ one.getName()+" "+" и "+ two.getName()+ " "+" с координатами "+
                " "+one.getCoordinateX()+ " "+ " и "+ " "+ two.getCoordinateX());
    }


}
