package com.nhlstenden.animals;

import java.time.LocalDate;

public class Pigeon extends Bird
{
    public Pigeon(int volume, String shoutName, LocalDate dateOfBirth)
    {
        super(volume, shoutName, dateOfBirth);
    }

    /**
     * A pigeon dies when it's three years old.
     *
     * @return True if the pigeon is dead.
     */
    @Override
    public boolean isDead()
    {
        LocalDate currentDate = LocalDate.now();
        // When the birth date plus three years is before the current date
        // the pigeon should be dead, so it should return true;
        return this.dateOfBirth.plusYears(3).minusDays(1).isBefore(currentDate);
    }

}
