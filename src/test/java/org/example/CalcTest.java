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
    void addPositive() {
        assertEquals(5, calc.add(1, 4));
    }

    @Test
    void addNegative() {
        assertEquals(-5, calc.add(-1, -4));
    }

    @Test
    void null_check() {
        assertThrows(IllegalArgumentException.class,
                () -> calc.add(null, 1));
    }
}
