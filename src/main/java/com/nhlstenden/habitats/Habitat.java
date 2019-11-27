package com.nhlstenden.habitats;

import com.nhlstenden.animals.Animal;
import com.nhlstenden.exception.AnimalDoesNotFitException;

import java.util.ArrayList;

public abstract class Habitat
{
    protected ArrayList<Animal> animalsInHabitat;
    protected int volume;

    public Habitat()
    {
        this.animalsInHabitat = new ArrayList<>();
    }

    public int getVolume()
    {
        return volume;
    }

    public void setVolume(int volume)
    {
        this.volume = volume;
    }

    public abstract void addAnimalToHabitat(Animal animal);

    protected void checkIfAnimalFits(Animal animalToAdd) throws AnimalDoesNotFitException
    {
        int totalAnimalVolume = 0;
        for (Animal animal : this.animalsInHabitat)
        {
            totalAnimalVolume += animal.getVolume();
        }

        if (animalToAdd.getVolume() < this.volume - totalAnimalVolume * 5)
        {
            throw new AnimalDoesNotFitException();
        }
    }
}
