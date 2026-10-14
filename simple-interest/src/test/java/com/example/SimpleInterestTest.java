package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleInterestTest {

    @Test
    public void testSimpleInterest() {
        SimpleInterest obj = new SimpleInterest();
        assertEquals(1000.0, obj.calculate(10000, 5, 2), 0.001);
    }

    @Test
    public void testZeroPrincipal() {
        SimpleInterest obj = new SimpleInterest();
        assertEquals(0.0, obj.calculate(0, 5, 2), 0.001);
    }

    @Test
    public void testZeroRate() {
        SimpleInterest obj = new SimpleInterest();
        assertEquals(0.0, obj.calculate(10000, 0, 2), 0.001);
    }

    @Test
    public void testOneYear() {
        SimpleInterest obj = new SimpleInterest();
        assertEquals(500.0, obj.calculate(10000, 5, 1), 0.001);
    }
}
