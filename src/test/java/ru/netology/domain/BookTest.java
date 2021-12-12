package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    private Book book = new Book(1, "Убить Пересмешника", 630, "Ли Харпер");

    @Test
    public void shouldCompareNameIfExist() {
        String text = "Убить Пересмешника";
        assertTrue(book.matches(text));
    }

    @Test
    public void shouldCompareNameIfNotExist() {
        String text = "Подойди поставь сторожа";
        assertFalse(book.matches(text));
    }

    @Test
    public void shouldCompareAuthorIfExist() {
        String text = "Ли Харпер";
        assertTrue(book.matches(text));
    }

    @Test
    public void shouldCompareAuthorIfNotExist() {
        String text = "Эдгар По";
        assertFalse(book.matches(text));
    }

}