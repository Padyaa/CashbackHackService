package ru.netology.service;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void shouldCalculateIfLessBoundary() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 500;
        int actual = 500;
        int expected = cashbackHackService.remain(amount);
        assertEquals(actual,expected);
    }

    @org.testng.annotations.Test
    public void shouldCalculateIfLowerAmountBoundary() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 0;
        int actual = 1000;
        int expected = cashbackHackService.remain(amount);
        assertEquals(actual,expected);
    }

    @org.testng.annotations.Test
    public void shouldCalculateIfUpperAmountBoundary() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;
        int actual = 0;
        int expected = cashbackHackService.remain(amount);
        assertEquals(actual,expected);
    }
}