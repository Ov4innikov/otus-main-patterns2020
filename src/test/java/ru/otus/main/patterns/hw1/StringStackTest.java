package ru.otus.main.patterns.hw1;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

public class StringStackTest {
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void put() {
        StringStack stringStack = new StringStack(4);
        stringStack.put(new String(new char[]{'1'}));

        Assertions.assertEquals(1, stringStack.getSize());
    }

    @org.junit.jupiter.api.Test
    void delete() {
        StringStack stringStack = new StringStack(4);
        stringStack.put(new String(new char[]{'1'}));
        stringStack.put(new CoolString(new char[]{'2', 'z', 's'}));
        Assertions.assertEquals(2, stringStack.getSize());
        stringStack.delete();
        Assertions.assertEquals(1, stringStack.getSize());
        stringStack.delete();
        Assertions.assertEquals(0, stringStack.getSize());
        stringStack.put(new CoolString(new char[]{'2', 'z', 's'}));
        Assertions.assertEquals(1, stringStack.getSize());
    }

    @org.junit.jupiter.api.Test
    void get() {
        StringStack stringStack = new StringStack(4);
        String expectedString = new String(new char[]{'1'});
        stringStack.put(expectedString);

        String actualString = stringStack.get();
        Assertions.assertEquals(expectedString, actualString);
    }

    @org.junit.jupiter.api.Test
    void isEmpty() {
        StringStack stringStack = new StringStack(4);
        Assertions.assertTrue(stringStack.isEmpty());
    }

    @org.junit.jupiter.api.Test
    void checkMethodToString() {
        StringStack stringStack = new StringStack(4);
        stringStack.put(new String(new char[]{'1'}));
        stringStack.put(new CoolString(new char[]{'2', 'z', 's'}));

        java.lang.String expectedString = "String:[{1},{2zs}]";
        Assertions.assertEquals(expectedString, stringStack.toString());
    }

}