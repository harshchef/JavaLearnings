package com.example.storage_service_dbms.juUintsample;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class MathSumTest {

    @BeforeAll
    void setUpBeforeAll() {
        System.out.println("Executed once before all tests");
    }

    @AfterAll
    void tearDownAfterAll() {
        System.out.println("Executed once after all tests");
    }

    @BeforeEach
    void setUpBeforeEach() {
        System.out.println("Executed before each test");
    }

    @AfterEach
    void tearDownAfterEach() {
        System.out.println("Executed after each test");
    }

    @Test
    void testSum() {
        MathSum mathSum = new MathSum();
        int[] numbers = {1, 2, 3, 4, 5};
        int result = mathSum.sum(numbers);
        // fail("u failed"); // Remove or comment this line to let the test run correctly
        assertEquals(15, result, "The sum should be 15");
    }

    @Test
    void testSumWithEmptyArray() {
        MathSum mathSum = new MathSum();
        int[] numbers = {};
        int result = mathSum.sum(numbers);
        assertEquals(0, result, "The sum of an empty array should be 0");
    }

    @Test
    void testSumWithNegativeNumbers() {
        MathSum mathSum = new MathSum();
        int[] numbers = {-1, -2, -3, -4, -5};
        int result = mathSum.sum(numbers);
        assertEquals(-15, result, "The sum should be -15");
    }

    @Test
    void testSumWithMixedNumbers() {
        MathSum mathSum = new MathSum();
        int[] numbers = {-1, 2, -3, 4, -5};
        int result = mathSum.sum(numbers);
        assertEquals(-3, result, "The sum should be -3");
    }
}
