package com.lambdaschool;

public abstract class AbstractAnimal
{
    private static int maxID;
    private int id;
    private String name;
    private int yearNamed;

    AbstractAnimal(String name, int yearNamed)
    {
        id = maxID;
        maxID ++;

        this.name = name;
        this.yearNamed = yearNamed;
    }

    public int getID()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getYearNamed()
    {
        return yearNamed;
    }

    public void setYearNamed(int yearNamed)
    {
        this.yearNamed = yearNamed;
    }

    public int getId()
    {
        return id;
    }
}
