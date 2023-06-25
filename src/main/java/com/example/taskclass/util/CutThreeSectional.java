package com.example.taskclass.util;

import com.example.taskclass.DoeblePoint;
import com.example.taskclass.Point;
import com.example.taskclass.TriePoint;

import java.util.UUID;

public class CutThreeSectional extends CutTwoSectional {


    @Override
    public TriePoint getOne() {
        return one;
    }

    public void setOne(TriePoint one) {
        this.one = one;
    }

    @Override
    public TriePoint getTwo() {
        return two;
    }

    public void setTwo(TriePoint two) {
        this.two = two;
    }

    private TriePoint one;
    private TriePoint two;


    public static double SegmentLenghtTwoSectional(TriePoint a, TriePoint b) throws PointerException {
        if (a instanceof TriePoint && b instanceof TriePoint) {
            return PointUtil.calculateDistance3D(a, b);
        }
        throw new PointerException(" неверный тип точки ");
    }

    public CutThreeSectional() {
        this.id = (UUID.randomUUID());
        name = id.toString();
    }

    public CutThreeSectional(TriePoint a, TriePoint b) {
        this.id = (UUID.randomUUID());
        name = id.toString();
    }

    @Override
    public void printInfoAboutCut() {{
            System.out.println( "Отрезок: "  + " " + getName() + " " + getId()+"\n"+" состоит из точек "+" "+ one.getName()+" "+" и "+ two.getName()+ " "+" с координатами "+
                    " "+one.getCoordinateX()+ " "+ " и "+ " "+ two.getCoordinateX());
        }
    }
}
