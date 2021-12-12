package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    private Product juice = new Product(1, "Сок Rich", 100);


    @Test
    public void shouldCompareNameIfExist() {
        String text = "Сок Rich";
        assertTrue(juice.matches(text));
    }

    @Test
    public void shouldCompareNameIfNotExist() {
        String text = "Сок Я";
        assertFalse(juice.matches(text));
    }
}