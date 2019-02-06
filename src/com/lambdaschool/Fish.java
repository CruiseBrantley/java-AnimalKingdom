package com.lambdaschool;

public class Fish extends AbstractAnimal
{
    private String move = "swim";
    private String breathe = "gills";
    private String reproduce = "eggs";
    public Fish(String name, int yearNamed)
    {
        super(name, yearNamed);
    }
}
