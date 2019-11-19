package com.nhlstenden.animals;

import java.time.LocalDate;

public abstract class Mammal extends Animal
{
    public Mammal(int volume, String shoutName, LocalDate dateOfBirth)
    {
        super(volume, shoutName, dateOfBirth);
    }

}
