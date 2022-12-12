package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {

    @Test
    public void NumbersInRange() {
        SQRService service = new SQRService();
        int actual = service.squarerange(200, 300);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NumbersUnderRange() {
        SQRService service = new SQRService();
        int actual = service.squarerange(1, 9);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NumbersOnRange() {
        SQRService service = new SQRService();
        int actual = service.squarerange(99, 100);
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }
}
