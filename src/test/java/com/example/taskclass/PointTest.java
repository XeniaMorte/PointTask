package com.example.taskclass;

import com.example.taskclass.util.Cut;
import org.junit.jupiter.api.Test;

import java.util.UUID;

class PointTest {

    @Test
    void test1() {
        Point a=new Point("one",UUID.randomUUID(),2.6);
        Point b=new Point("two",UUID.randomUUID(),6.6);
        TriePoint triePoint=new TriePoint( "34576", UUID.randomUUID(),2.0,2.0,2.0);
        TriePoint triePoint2=new TriePoint( "3456", UUID.randomUUID(),3.0,3.0,3.0);
        Cut cut=new Cut(a,b);
//        var result = triePoint.calculateDistance(triePoint2);
//        System.out.println(result);
//        var result = a.calculateDistance(b);
//        System.out.println(result);
        var resultsecond=triePoint.calculateDistance(triePoint2);
        System.out.println(resultsecond);

    }
}
