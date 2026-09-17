package com.example;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void addsPositiveNumbers() {
        assertEquals(5, App.add(2, 3));
    }

    @Test
    void addsNegativeNumbers() {
        assertEquals(-5, App.add(-2, -3));
    }

    @Test
    void addsZero() {
        assertEquals(7, App.add(7, 0));
    }

    @Test
    @Disabled("skipped on purpose")
    void testShouldBeSkipped() {
        fail("never runs");
    }

    @Test
    void testShouldBeFailed() {
        assertEquals(6, App.add(2, 3));
    }
}
