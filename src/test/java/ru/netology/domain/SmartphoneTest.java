package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmartphoneTest {
    private Smartphone smartphone = new Smartphone(5, "IPhone13", 135000, "Apple");

    @Test
    public void shouldCompareNameIfExist() {
        String text = "IPhone13";
        assertTrue(smartphone.matches(text));
    }

    @Test
    public void shouldCompareNameIfNotExist() {
        String text = "IPhone7 plus";
        assertFalse(smartphone.matches(text));
    }

    @Test
    public void shouldCompareVendorIfExist() {
        String text = "Apple";
        assertTrue(smartphone.matches(text));
    }

    @Test
    public void shouldCompareVendorIfNotExist() {
        String text = "POCO";
        assertFalse(smartphone.matches(text));
    }
}