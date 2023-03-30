package org.example;

public class Calc {
    public Integer add(Integer a, Integer b) {
        if (a == null) {
            throw new IllegalArgumentException("a can't be null");
        }
        if (b == null) {
            throw new IllegalArgumentException("b can't be null");
        }
        return a + b;
    }
}
