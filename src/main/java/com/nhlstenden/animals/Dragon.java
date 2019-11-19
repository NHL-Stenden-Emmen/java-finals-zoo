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
        // TODO: Make this method.
        return false;
    }

}
