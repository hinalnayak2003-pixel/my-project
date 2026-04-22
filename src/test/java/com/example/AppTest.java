package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void testGreet() {
        assertEquals("Hello, Jenkins!", App.greet("Jenkins"));
    }

    @Test
    void testGreetWorld() {
        assertEquals("Hello, World!", App.greet("World"));
    }
}
