package com.nhlstenden.animals;

import java.time.LocalDate;

public abstract class Fish extends Animal
{
    public Fish(int volume, String shoutName, LocalDate dateOfBirth)
    {
        super(volume, shoutName, dateOfBirth);
    }

}
