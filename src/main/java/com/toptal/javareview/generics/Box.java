package com.toptal.javareview.generics;

public class Box<T> {

    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return this.value;
    }
}
