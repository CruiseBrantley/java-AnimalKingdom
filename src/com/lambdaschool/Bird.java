package com.lambdaschool;

public class Bird extends AbstractAnimal
{
    Bird(String name, int yearNamed)
    {
        super(name, yearNamed);
        setMove("fly");
        setBreathe("lungs");
        setReproduce("eggs");
    }

    @Override
    public String toString()
    {
        return "Bird{" +
                "move='" + getMove() + '\'' +
                ", breathe='" + getBreathe() + '\'' +
                ", reproduce='" + getReproduce() + '\'' +
                ", name='" + getName() + '\'' +
                ", yearNamed='" + getYearNamed() + '\'' +
                ", id='" + getId() + '\'' +
                '}';
    }
}