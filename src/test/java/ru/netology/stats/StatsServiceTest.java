package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void calculateSum() {

        StatsService service = new StatsService();
        int actual = service.calculateSum(sales);
        int expected = 180;
        assertEquals(expected, actual);
    }

    @Test
    void calculateAVG() {

        StatsService service = new StatsService();
        int actual = service.calculateAVG(sales);
        int expected = 15;
        assertEquals(expected, actual);
    }

    @Test
    void calculateIndexMaxSale() {

        StatsService service = new StatsService();
        int actual = service.calculateIndexMaxSale(sales);
        int expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    void calculateIndexMinSale() {

        StatsService service = new StatsService();
        int actual = service.calculateIndexMinSale(sales);
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    void calculateSalesUnderAVG() {

        StatsService service = new StatsService();
        int actual = service.calculateSalesUnderAVG(sales);
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    void calculateSalesOverAVG() {

        StatsService service = new StatsService();
        int actual = service.calculateSalesOverAVG(sales);
        int expected = 5;
        assertEquals(expected, actual);
    }

}