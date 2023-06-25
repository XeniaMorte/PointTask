package com.example.taskclass.util;

import com.example.taskclass.DoeblePoint;
import com.example.taskclass.util.PointUtil;

import java.util.UUID;

public class CutTwoSectional extends Cut {
    private DoeblePoint one;
    private DoeblePoint two;
    public String message=" неверный тип точки";

    public DoeblePoint getOne() {
        return one;
    }

    public void setOne(DoeblePoint one) {
        this.one = one;
    }

    public DoeblePoint getTwo() {
        return two;
    }

    public void setTwo(DoeblePoint two) {
        this.two = two;
    }
public CutTwoSectional(){
    this.id=(UUID.randomUUID());
    name = id.toString();
}
public CutTwoSectional(DoeblePoint a,DoeblePoint b){
    this.id=(UUID.randomUUID());
    name = id.toString();
}
public static double SegmentLenghtTwoSectional(DoeblePoint a,DoeblePoint b) throws PointerException {
        if (a instanceof DoeblePoint&& b instanceof  DoeblePoint){
            return  PointUtil.calculateDistance2D(a, b);
        }
        throw new PointerException(" неверный тип точки ");
}@Override
    public void printInfoAboutCut() {
        System.out.println( "Отрезок: "  + " " + getName() + " " + getId()+"\n"+" состоит из точек "+" "+ one.getName()+" "+" и "+ two.getName()+ " "+" с координатами "+
                " "+one.getCoordinateX()+ " "+ " и "+ " "+ two.getCoordinateX());
    }
}
