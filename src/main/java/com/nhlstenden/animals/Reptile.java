package com.nhlstenden.animals;

import java.time.LocalDate;

public abstract class Reptile extends Animal
{
    public Reptile(int volume, String shoutName, LocalDate dateOfBirth)
    {
        super(volume, shoutName, dateOfBirth);
    }

}
