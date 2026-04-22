package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void testGreet() {
        assertEquals("Hello, Jenkins! Welcome to Jenkins CI/CD!", 
                      App.greet("Jenkins"));
    }

    @Test
    void testAdd() {
        assertEquals(5, App.add(2, 3));
    }

    @Test
    void testAddNegative() {
        assertEquals(-1, App.add(2, -3));
    }
}
