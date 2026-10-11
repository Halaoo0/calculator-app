package com.student;
import org.junit.jupiter.api.BeforeEach; import org.junit.jupiter.api.Test; import static org.junit.jupiter.api.Assertions.*;
class CalculatorTest { private Calculator calculator; // Shared instance
@BeforeEach
void setup() {
    // Runs before EACH test method
    calculator = new Calculator();
}

@Test
void testAdd() {
    assertEquals(5, calculator.add(2, 3));
}

@Test
void testSubtract() {
    assertEquals(6, calculator.subtract(10, 4));
}
}