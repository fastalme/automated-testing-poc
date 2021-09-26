package com.example;

import org.junit.jupiter.api.*;

public class JUnitBasicTest {

    @BeforeAll
    public static void runBeforeAllTheTestsOfThisClass() {
        System.out.println ("--Esta rutina se ejecuta antes de todos los tests de esta clase");
    }

    @AfterAll
    public static void runAfterAllTheTestsOfThisClass() {
        System.out.println ("--Esta rutina se ejecuta después de todos los tests de esta clase");
    }

    @BeforeEach
    public void runBeforeEachTest() {
        System.out.println ("----Esta rutina se ejecuta antes de cada test");
    }

    @AfterEach
    public void runAfterEachTest() {
        System.out.println ("----Esta rutina se ejecuta después de cada test");
    }

    @Test
    public void test1() {
        System.out.println ("------Se ejecuta el test 1");
    }

    @Test
    public void test2() {
        System.out.println ("------Se ejecuta el test 2");
    }

}
