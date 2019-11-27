package com.nhlstenden.exception;

public class AnimalDoesNotFitException extends Exception
{
    public AnimalDoesNotFitException()
    {
        super("This animal does not fit!");
    }
}
