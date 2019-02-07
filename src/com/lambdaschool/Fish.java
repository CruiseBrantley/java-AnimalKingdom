package com.lambdaschool;

public class Fish extends AbstractAnimal
{
    Fish(String name, int yearNamed)
    {
        super(name, yearNamed);
        setMove("swim");
        setBreathe("gills");
        setReproduce("eggs");
    }

    @Override
    public String toString()
    {
        return "Fish{" +
                "move='" + getMove() + '\'' +
                ", breathe='" + getBreathe() + '\'' +
                ", reproduce='" + getReproduce() + '\'' +
                ", name='" + getName() + '\'' +
                ", yearNamed='" + getYearNamed() + '\'' +
                ", id='" + getId() + '\'' +
                '}';
    }
}