package com.nhlstenden.animals;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PigeonTest
{

    @Test
    void shouldBeDead()
    {
        LocalDate tenYearsBack = LocalDate.now().minusYears(10);
        Pigeon pigeon = new Pigeon(200, "Piet", tenYearsBack);
        assertTrue(pigeon.isDead());
    }

    @Test
    void shouldBeAlmostDead()
    {
        LocalDate threeYearsBackPlusOneDay = LocalDate.now().minusYears(3).plusDays(1);
        Pigeon pigeon = new Pigeon(200, "Piet", threeYearsBackPlusOneDay);
        assertFalse(pigeon.isDead());
    }

    @Test
    void shouldBeAlive()
    {
        LocalDate today = LocalDate.now();
        Pigeon pigeon = new Pigeon(200, "Piet", today);
        assertFalse(pigeon.isDead());
    }

    @Test
    void shouldBeDying()
    {
        LocalDate threeYearsBack = LocalDate.now().minusYears(3);
        Pigeon pigeon = new Pigeon(200, "Piet", threeYearsBack);
        assertTrue(pigeon.isDead());
    }

}