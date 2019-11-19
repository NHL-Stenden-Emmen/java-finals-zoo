package com.nhlstenden.animals;

import java.time.LocalDate;

public abstract class Fantasy extends Animal
{
    public Fantasy(int volume, String shoutName, LocalDate dateOfBirth)
    {
        super(volume, shoutName, dateOfBirth);
    }

}
