package com.nhlstenden.animals;

import java.time.LocalDate;

public abstract class Animal
{
    protected int volume;
    protected String shoutName;
    protected LocalDate dateOfBirth;

    public Animal(int volume, String shoutName, LocalDate dateOfBirth)
    {
        this.volume = volume;
        this.shoutName = shoutName;
        this.dateOfBirth = dateOfBirth;
    }

    public int getVolume()
    {
        return volume;
    }

    public void setVolume(int volume)
    {
        this.volume = volume;
    }

    public String getShoutName()
    {
        return shoutName;
    }

    public void setShoutName(String shoutName)
    {
        this.shoutName = shoutName;
    }

    public LocalDate getDateOfBirth()
    {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth)
    {
        this.dateOfBirth = dateOfBirth;
    }

    public abstract boolean isDead();

}
