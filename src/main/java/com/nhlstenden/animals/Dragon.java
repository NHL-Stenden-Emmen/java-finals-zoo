package com.nhlstenden.animals;

import java.time.LocalDate;

public class Dragon extends Fantasy
{
    private int depressionLevel;

    public Dragon(int volume, String shoutName, LocalDate dateOfBirth)
    {
        super(volume, shoutName, dateOfBirth);
        this.depressionLevel = 0;
    }

    public void makeRideOnDragon()
    {
        this.depressionLevel += 1;
    }

    /**
     * Dragon dies after 350 years. But per depression level he will
     * live a month less.
     *
     * @return True if dragon is dead.
     */
    @Override
    public boolean isDead()
    {
        LocalDate currentDate = LocalDate.now();
        // When the birth date plus 350 years is before the current date
        // the dragon should be dead, so it should return true;
        return this.dateOfBirth.plusYears(350).minusMonths(this.depressionLevel).minusDays(1).isBefore(currentDate);
    }

}
