package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    // Original test
    @Test
    void testGreet() {
        assertEquals("Hello, Jenkins! Welcome to Jenkins CI/CD!",
                      App.greet("Jenkins"));
    }

    // New test → multiply
    @Test
    void testMultiply() {
        assertEquals(15, App.multiply(5, 3));
    }

    // New test → isEven
    @Test
    void testIsEven() {
        assertEquals(true,  App.isEven(4));
        assertEquals(false, App.isEven(7));
    }
}
