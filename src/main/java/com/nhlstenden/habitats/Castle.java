package com.nhlstenden.habitats;

import com.nhlstenden.animals.Animal;
import com.nhlstenden.animals.Dragon;
import com.nhlstenden.exception.AnimalDoesNotFitException;

public class Castle extends Habitat
{
    public Castle(int volume)
    {
        super();
        this.volume = volume;
    }

    @Override
    public void addAnimalToHabitat(Animal animal)
    {
        if (animal instanceof Dragon)
        {
            try
            {
                this.checkIfAnimalFits(animal);
                this.animalsInHabitat.add(animal);
            }
            catch (AnimalDoesNotFitException e)
            {
                System.out.println(e.getMessage());
            }
        }
    }
}
