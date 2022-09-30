package com.example.myapplication;

import org.junit.Test;

import static org.junit.Assert.*;

import models.BucketList;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        BucketList b = new BucketList();
        b.addItem("skydiving");
        b.addItem("eat food");
        assertEquals(2, b.size());
        b.removeItem("eat food");
        assertEquals(1, b.size());
    }
}