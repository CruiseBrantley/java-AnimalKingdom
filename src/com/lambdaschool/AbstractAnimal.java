package com.lambdaschool;

public abstract class AbstractAnimal
{
    private static int maxID;
    private int id;
    private String name;
    private int yearNamed;
    private String move;
    private String breathe;
    private String reproduce;

    AbstractAnimal(String name, int yearNamed)
    {
        id = maxID;
        maxID ++;

        this.name = name;
        this.yearNamed = yearNamed;
    }

    String getMove()
    {
        return move;
    }

    public void setMove(String move)
    {
        this.move = move;
    }

    public String getBreathe()
    {
        return breathe;
    }

    public void setBreathe(String breathe)
    {
        this.breathe = breathe;
    }

    public String getReproduce()
    {
        return reproduce;
    }

    public void setReproduce(String reproduce)
    {
        this.reproduce = reproduce;
    }

    String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    int getYearNamed()
    {
        return yearNamed;
    }

    public void setYearNamed(int yearNamed)
    {
        this.yearNamed = yearNamed;
    }

    int getId()
    {
        return id;
    }
}
