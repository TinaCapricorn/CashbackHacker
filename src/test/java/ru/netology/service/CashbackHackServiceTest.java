package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

        @Test
        public void less1000rubles() {
            CashbackHackService cashbackHackService = new CashbackHackService();
            int expected = 1;
            int actual = cashbackHackService.remain(999);
            assertEquals(expected, actual);
        }

        @Test
        public void exactly1000rubles() {
            CashbackHackService cashbackHackService = new CashbackHackService();
            int expected = 0;
            int actual = cashbackHackService.remain(1000);
            assertEquals(expected, actual);
        }

        @Test
        public void less2000rubles() {
            CashbackHackService cashbackHackService = new CashbackHackService();
            int expected = 1;
            int actual = cashbackHackService.remain(1999);
            assertEquals(expected, actual);
        }

 }