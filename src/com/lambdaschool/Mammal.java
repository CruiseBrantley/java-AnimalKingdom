package com.lambdaschool;

public class Mammal extends AbstractAnimal
{
    Mammal(String name, int yearNamed)
    {
        super(name, yearNamed);
        setMove("walk");
        setBreathe("lungs");
        setReproduce("live births");
    }
    @Override
    public String toString()
    {
        return "Mammal{" +
                "move='" + getMove() + '\'' +
                ", breathe='" + getBreathe() + '\'' +
                ", reproduce='" + getReproduce() + '\'' +
                ", name='" + getName() + '\'' +
                ", yearNamed='" + getYearNamed() + '\'' +
                ", id='" + getId() + '\'' +
                '}';
    }
}