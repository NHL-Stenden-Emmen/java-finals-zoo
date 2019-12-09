package com.nhlstenden.habitats;

import com.nhlstenden.animals.Dragon;
import com.nhlstenden.exception.AnimalDoesNotFitException;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class HabitatTest
{
    @Test
    public void animalShouldNotFit()
    {
        LocalDate fiveYearsBack = LocalDate.now().minusYears(5);
        Dragon dragon = new Dragon(50,"robbin", fiveYearsBack);
        // castle has been made
        Castle castle = new Castle(249);
        //checks if exeption is thrown in function
        assertThrows(AnimalDoesNotFitException.class, () -> castle.checkIfAnimalFits(dragon));
    }

    @Test
    public void animalShouldFit()
    {
        LocalDate fiveYearsBack = LocalDate.now().minusYears(5);
        Dragon dragon = new Dragon(50,"robbin", fiveYearsBack);
        // castle has been made
        Castle castle = new Castle(600);
        //checks if exeption is thrown in function
        assertDoesNotThrow(() -> castle.checkIfAnimalFits(dragon));
    }

    @Test
    public void twoAnimalsShouldNotFit()
    {
        LocalDate fiveYearsBack = LocalDate.now().minusYears(5);
        Dragon dragon = new Dragon(50,"jal", fiveYearsBack);
        Dragon dragon2 = new Dragon(50,"cappie", fiveYearsBack);
        Castle castle = new Castle(249);
        castle.addAnimalToHabitat(dragon);
        assertThrows(AnimalDoesNotFitException.class, () -> castle.checkIfAnimalFits(dragon2));
    }

    @Test
    public void twoAnimalsShouldFit()
    {
        LocalDate fiveYearsBack = LocalDate.now().minusYears(5);
        Dragon dragon = new Dragon(50,"jal", fiveYearsBack);
        Dragon dragon2 = new Dragon(50,"cappie", fiveYearsBack);
        Castle castle = new Castle (600);
        castle.addAnimalToHabitat(dragon);
        assertDoesNotThrow( () -> castle.checkIfAnimalFits(dragon2));
    }
}