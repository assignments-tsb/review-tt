package com.toptal.javareview.generics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GenericsTest {

    @Test
    public void simpleGenerics() {
        Box<Integer> integerBox = new Box<>();

        integerBox.set(1);
        integerBox.set(2);

        assertEquals(2, (int) integerBox.get());
    }

    /**
     * this is how we fool the compiler
     */
    @Test
    void breakTypeSafety() {

        Box rawBox = new Box();
        rawBox.set("test");

        Box<Integer> integerBox = rawBox;

        System.out.println(integerBox.get()); //will print "test"

        int sum = 1 + integerBox.get(); //ClassCastException
    }
}
