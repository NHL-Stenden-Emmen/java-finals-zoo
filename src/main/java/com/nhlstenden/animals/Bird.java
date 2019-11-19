package com.nhlstenden.animals;

import java.time.LocalDate;

public abstract class Bird extends Animal
{
    public Bird(int volume, String shoutName, LocalDate dateOfBirth)
    {
        super(volume, shoutName, dateOfBirth);
    }

}
