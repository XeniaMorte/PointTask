package com.example.taskclass;

import org.junit.jupiter.api.Test;

import java.util.UUID;

class PointTest {

    @Test
    void test1() {
        TriePoint triePoint=new TriePoint( "34576", UUID.randomUUID(),2.0,2.0,2.0);
        TriePoint triePoint2=new TriePoint( "3456", UUID.randomUUID(),3.0,3.0,3.0);
        var result = triePoint.calculateDistance(triePoint2);
        System.out.println(result);
    }
}
