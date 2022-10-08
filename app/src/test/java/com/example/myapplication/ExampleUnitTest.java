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
    public void add_tests() {
        BucketList b = new BucketList();
        b.addItem("skydiving");
        b.addItem("eat food");
        assertEquals(0, b.getIndex("skydiving"));
        assertEquals("skydiving", b.getItem(0));
        assertEquals("eat food", b.getItem(1));
        assertEquals(2, b.size());
    }
    @Test
    public void remove_tests() {
        BucketList b = new BucketList();
        assertFalse(b.removeItem("skydiving"));
        b.addItem("skydiving");
        b.addItem("eat food");
        assertEquals(1, b.getIndex("eat food"));
        assertTrue(b.removeItem("skydiving"));
        assertEquals("eat food", b.getItem(0));
        assertEquals(1, b.size());
    }
}