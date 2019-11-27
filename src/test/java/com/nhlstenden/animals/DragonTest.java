package com.nhlstenden.animals;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

class DragonTest
{
    @Test
    void shouldBeDead()
    {
        LocalDate fourHundredYearsBack = LocalDate.now().minusYears(400);
        Dragon dragon = new Dragon(200, "Nick", fourHundredYearsBack);
        assertTrue(dragon.isDead());
    }
    @Test
    void shouldBeDying()
    {
        LocalDate threeHundredFiftyYearsBack = LocalDate.now().minusYears(350);
        Dragon dragon = new Dragon(200, "Stefan", threeHundredFiftyYearsBack);
        assertTrue(dragon.isDead());
    }
    @Test
    void shouldBeAlive()
    {
        LocalDate threeHundredYearsBack = LocalDate.now().minusYears(300);
        Dragon dragon = new Dragon(200,"Ivar", threeHundredYearsBack);
        assertFalse(dragon.isDead());
    }
    @Test
    void shouldBeJustAlive()
    {
        LocalDate threeHundredAndFourtyNineYearsAndTenMonthsBack = LocalDate.now().minusYears(349).minusMonths(10);
        Dragon dragon = new Dragon(200, "Kevin", threeHundredAndFourtyNineYearsAndTenMonthsBack);
        assertFalse(dragon.isDead());
    }
    @Test
    void shouldBeDepressedAndAlive()
    {
        LocalDate threeHundredAndFourtyNineYearsAndTenMonthsBack = LocalDate.now().minusYears(349).minusMonths(10);
        Dragon dragon = new Dragon(200,"Wesley", threeHundredAndFourtyNineYearsAndTenMonthsBack);
        dragon.makeRideOnDragon();
        assertFalse(dragon.isDead());
    }
    @Test
    void shouldBeDeadOfDepression()
    {
        LocalDate threeHundredAndFourtyNineYearsAndTenMonthsBack = LocalDate.now().minusYears(349).minusMonths(10);
        Dragon dragon = new Dragon(200,"Andrej", threeHundredAndFourtyNineYearsAndTenMonthsBack);
        // This should depress the dragon and make him die earlier :(
        dragon.makeRideOnDragon();
        dragon.makeRideOnDragon();
        assertTrue(dragon.isDead());
    }
}