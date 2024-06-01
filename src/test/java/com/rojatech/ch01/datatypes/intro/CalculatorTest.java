package com.rojatech.ch01.datatypes.intro;

import com.rojatech.ch03.java8.streams.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    @DisplayName("Add two numbers")
    void add() {
        assertEquals(4, Calculator.add(2,2));
    }

    @Test
    @DisplayName("Multiply two numbers")
    void multiply() {
        assertAll(()->assertEquals(4, Calculator.multiply(2,2)),
                ()->assertEquals(-4, Calculator.multiply(2,-2)),
                ()->assertEquals(4, Calculator.multiply(-2,-2)),
                ()->assertEquals(0, Calculator.multiply(0,2))
                );
    }
}