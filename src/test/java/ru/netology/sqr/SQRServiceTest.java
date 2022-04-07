package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void shouldcounterOfNumbersOfSquaresInDiapason() {
        SQRService service = new SQRService();
        int expected = 3;
        int actual = service.counterOfNumbersOfSquares(200, 300);
        assertEquals(expected, actual);
    }

    @Test
    void shouldcounterOfNumbersOfSquaresNotInDiapason() {
        SQRService service = new SQRService();
        int expected = 3;
        int actual = service.counterOfNumbersOfSquares(199, 301);
        assertEquals(expected, actual);
    }

    @Test
    void shouldcounterOfNumbersOfSquaresNotInDiapason1() {
        SQRService service = new SQRService();
        int expected = 0;
        int actual = service.counterOfNumbersOfSquares(10, 99);
        assertEquals(expected, actual);
    }

    @Test
    void shouldcounterOfNumbersOfSquaresNotInDiapason2() {
        SQRService service = new SQRService();
        int expected = 6;
        int actual = service.counterOfNumbersOfSquares(666, 999);
        assertEquals(expected, actual);
    }

    @Test
    void shouldcounterOfNumbersOfSquaresNotInDiapason3() {
        SQRService service = new SQRService();
        int expected = 22;
        int actual = service.counterOfNumbersOfSquares(1, 999);
        assertEquals(expected, actual);
    }
}