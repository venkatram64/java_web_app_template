package com.venkat.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    void add(){
        assertEquals(5, calculator.add(2,3));
    }
}
