package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class CalcTest {

    private Calc calc;

    @BeforeAll
    void prepareCalc() {
        calc = new Calc();
    }


    @Test
    void add() {
        assertEquals(5, calc.add(1, 4));
    }

    @Test
    void sub() {
        assertEquals(3, calc.sub(7, 4));
    }
}