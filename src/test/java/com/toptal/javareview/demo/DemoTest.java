package com.toptal.javareview.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DemoTest {

    @Test
    public void myDemoTest() {
        Demo demo = new Demo();

        assertEquals(0, demo.getSomething());
    }
}
