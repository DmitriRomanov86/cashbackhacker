package ru.netology.service;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void shouldReturnIf100AmountIs900() {
        CashbackHackService cashbackHackService = new CashbackHackService ();
        int amount = 900;
        int actual = cashbackHackService.remain(amount);
        int expected = 100;
        assertEquals(actual,expected);
    }

    @org.testng.annotations.Test
    public void shouldReturnIf0AmountIs1000() {
        CashbackHackService cashbackHackService = new CashbackHackService ();
        int amount = 1000;
        int actual = cashbackHackService.remain(amount);
        int expected = 0;
        assertEquals(actual,expected);
    }
}