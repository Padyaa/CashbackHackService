package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;
public class CashbackHackServiceTest {

    @org.junit.Test
    public void shouldCalculateIfLessBoundary() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 500;
        int actual = 500;
        int expected = cashbackHackService.remain(amount);
        assertEquals(actual,expected);
    }

    @org.junit.Test
    public void shouldCalculateIfLowerAmountBoundary() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 0;
        int actual = 1000;
        int expected = cashbackHackService.remain(amount);
        assertEquals(actual,expected);
    }

    @org.junit.Test
    public void shouldCalculateIfUpperAmountBoundary() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;
        int actual = 0;
        int expected = cashbackHackService.remain(amount);
        assertEquals(actual,expected);
    }
}