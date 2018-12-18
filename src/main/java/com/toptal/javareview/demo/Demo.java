package com.toptal.javareview.demo;

public class Demo {

    private int intVal;
    private String stringVal;

    public Demo() {
        this.intVal = 0;
        this.stringVal = "";
    }

    public void doSomething() {
        intVal++;
    }

    public int getSomething() {
        return this.intVal;
    }
}
